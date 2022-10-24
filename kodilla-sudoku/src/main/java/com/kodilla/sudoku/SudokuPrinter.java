package com.kodilla.sudoku;
import java.util.List;

public class SudokuPrinter {

    public void print(SudokuBoard sudokuBoard){
        System.out.println("\u001B[34m"+"                   Actual Sudoku board:"+"\u001B[0m" );
        List<SudokuRow> sudokuBoards = sudokuBoard.getSudokuRowList();
        //for (SudokuRow sudokuRow : sudokuBoards) {
            for (int n=0; n < 9; n++) {
                if (n==3||n==6){
                    System.out.println("   ---------------------------------------------------");
                }
            for (int j = 0; j < sudokuBoards.get(n).getSudokuRowElements().size(); j++) {
                if (j==2||j==5) {
                    System.out.print(sudokuBoards.get(n).getSudokuRowElements().get(j) + "     | ");
                } else {
                    System.out.print(sudokuBoards.get(n).getSudokuRowElements().get(j) + "  ");
                }
            }
            System.out.println();

        }
    }
}