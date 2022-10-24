package com.kodilla.sudoku;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SudokuTestSuite {

    @Test
    void addSudokuElementTest(){
        //Given
        SudokuBoard sudokuBoard=new SudokuBoard();
       sudokuBoard.getSudokuRowList().add(new SudokuRow());
       sudokuBoard.getSudokuRowList().get(0).getSudokuRowElements().add(new SudokuElement(2));

        //When
        // sudokuBoard.addNumberToSudoku(1,1, 2);
        int result = sudokuBoard.getSudokuRowList().get(0).getSudokuRowElements().get(0).getValue();

        //Then
        Assertions.assertEquals(2, result);
    }


}
