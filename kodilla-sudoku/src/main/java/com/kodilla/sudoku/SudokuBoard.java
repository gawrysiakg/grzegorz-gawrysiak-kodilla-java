package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype {

    private List<SudokuRow> sudokuRowList = new ArrayList<>();

    public SudokuBoard() {
    }

    public void initBoard(){
        for (int i = 0; i < 9 ; i++) {
            sudokuRowList.add(new SudokuRow());
        }
        for (SudokuRow sudokuRow : sudokuRowList){
            sudokuRow.fillRowDefaultValues();
        }
    }


    public void addNumberToSudoku(int x, int y, int number ){
        sudokuRowList.get(x-1).getSudokuRowElements().set(y-1,new SudokuElement(number));
    }

    public List<SudokuRow> getSudokuRowList() {
        return sudokuRowList;
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard cloneSudokuBoard = (SudokuBoard)super.clone();
        cloneSudokuBoard.sudokuRowList = new ArrayList<>();
        for (SudokuRow cloneSudokuRow : sudokuRowList){
            SudokuRow clonedRow = new SudokuRow();
            clonedRow.sudokuRowElements = new ArrayList<>();
            for (SudokuElement sudokuElement : cloneSudokuRow.getSudokuRowElements()){
                SudokuElement clonedElement = new SudokuElement(sudokuElement.getValue());
                clonedElement.possibleValues = new ArrayList<>();
               for(Integer singleField : clonedElement.getPossibleValues()){
                   sudokuElement.getPossibleValues().add(singleField);
               }
            }
            cloneSudokuBoard.getSudokuRowList().add(cloneSudokuRow);
        }
        return  cloneSudokuBoard;
    }
}