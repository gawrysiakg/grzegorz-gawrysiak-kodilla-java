package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    protected List<SudokuElement> sudokuRowElements = new ArrayList<>();

    public SudokuRow() {
    }

    public List<SudokuElement> fillRowDefaultValues(){
        for (int i = 0; i <9 ; i++) {
            sudokuRowElements.add(new SudokuElement(SudokuElement.EMPTY));
        }
        return new ArrayList<>(sudokuRowElements);
    }

    public List<SudokuElement> getSudokuRowElements() {
        return sudokuRowElements;
    }

}