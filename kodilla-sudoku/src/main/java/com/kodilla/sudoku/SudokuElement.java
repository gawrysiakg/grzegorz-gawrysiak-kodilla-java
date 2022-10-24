package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    public static final int EMPTY = 0;
    private int value;
    protected List <Integer> possibleValues;

    public SudokuElement(int value) {
        this.value = value;
        this.possibleValues = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    @Override
    public String toString() {
        return "\t" + value ;
    }
}