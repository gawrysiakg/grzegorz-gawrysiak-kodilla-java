package com.kodilla.sudoku;
public class SudokuSolver extends Prototype {

    private SudokuBoard workingSudokuBoard;

    public SudokuSolver(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        this.workingSudokuBoard = sudokuBoard.deepCopy();
    }

    public SudokuBoard solve() throws CloneNotSupportedException {
        if (!solveBoard()) {
            throw new IllegalArgumentException("not possible to solve");
        }
        return workingSudokuBoard.deepCopy();
    }

    private boolean solveBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (notFilled(i, j)) {
                    return solveField(i, j);
                }
            }
        }
        return true;
    }

    private boolean solveField(int i, int j) {
        for (int k = 1; k < 10; k++) {
            if (isPossibleToFill(i, j, k)) {
                workingSudokuBoard.getSudokuRowList().get(i)
                        .getSudokuRowElements().get(j).setValue(k);
                if (solveBoard()) {
                    return true;
                }
                workingSudokuBoard.getSudokuRowList().get(i)
                        .getSudokuRowElements().get(j).setValue(SudokuElement.EMPTY);
            }
        }
        return false;
    }

    private boolean isPossibleToFill(int x, int y, int value) {

        return notExistInLines(x, y, value) && notExistInBox(x, y, value);
    }

    private boolean notExistInBox(int x, int y, int value) {
        int startX = x - x % 3;
        int startY = y - y % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(workingSudokuBoard.getSudokuRowList()
                        .get(startX + i).getSudokuRowElements().get(startY + j).getValue() == value) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean notExistInLines(int x, int y, int value) {
        for (int i = 0; i < 9; i++) {
            if( workingSudokuBoard.getSudokuRowList().get(i).
                    getSudokuRowElements().get(y).getValue() == value ||
                    workingSudokuBoard.getSudokuRowList().get(x).
                    getSudokuRowElements().get(i).getValue() == value
            )
                return false;
        }

        return true;
    }

    private boolean notFilled(int x, int y) {
        return workingSudokuBoard.getSudokuRowList().get(x)
                .getSudokuRowElements().get(y).getValue() == SudokuElement.EMPTY;
    }


}