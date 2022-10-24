package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SudokuGame {

    private SudokuBoard sudokuBoard = new SudokuBoard();
    private SudokuPrinter sudokuPrinter = new SudokuPrinter();
    private Scanner scanner = new Scanner(System.in);
    private String choice;


    public boolean resolveSudoku()  {
        sudokuBoard.initBoard();
        fillInProcess();
        solveSudoku();
        return endGameQuestion();
    }


    private void fillInProcess(){
        System.out.println("Welcome in Sudoku Solver");
        boolean endFilling;

        do {
            sudokuPrinter.print(sudokuBoard);

           int row = validateRow();
           int column = validateColumn();
           int value = validateValue();

            sudokuBoard.addNumberToSudoku(row, column, value);
            endFilling = checkEndFillingIn();
        }while (!endFilling);
    }


    private boolean checkEndFillingIn(){
        System.out.println("Next value ? y/n");
        choice = scanner.nextLine();
        if (choice.equals("n") || (choice.equals("N"))) {
            return true;
        } else return false;
    }

    private boolean endGameQuestion(){
        System.out.println("y - end game || n - start again");
        choice = scanner.nextLine();
        return (choice.equalsIgnoreCase("y"));
    }


    private void solveSudoku() {

        do{
            System.out.println("Pleas write SUDOKU to solve the board");
            choice = scanner.nextLine();
        } while (!choice.equalsIgnoreCase("SUDOKU"));

        try {
            SudokuSolver sudokuSolver = new SudokuSolver(sudokuBoard);
            SudokuBoard result = sudokuSolver.solve();
            sudokuPrinter.print(result);
        } catch (CloneNotSupportedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private int validateRow(){
        int row;
        do {
            try {
                System.out.println("Enter number of row: ");
                row = scanner.nextInt();
                scanner.nextLine();
                if(!(row>0&&row<10)){
                    System.out.println("Invalid number entered");
                }
            } catch (InputMismatchException ex) {
                row = scanner.nextInt();
            }
        } while(!(row>0&&row<10));
        return row;
    }

    private int validateColumn(){
        int column;
        do {
            try {
                System.out.println("Enter number of column: ");
                column = scanner.nextInt();
                scanner.nextLine();
                if(!(column>0&&column<10)){
                    System.out.println("Invalid number entered");
                }
            } catch (InputMismatchException ex) {
                column = scanner.nextInt();
            }
        } while(!(column>0&&column<10));
        return column;
    }

    private int validateValue(){
        int value;
        do {
            try {
                System.out.println("Enter value: ");
                value = scanner.nextInt();
                scanner.nextLine();
                if(!(value>0&&value<10)){
                    System.out.println("Invalid number entered");
                }
            } catch (InputMismatchException ex) {
                value = scanner.nextInt();
            }
        } while(!(value>0&&value<10));
        return value;
    }

}