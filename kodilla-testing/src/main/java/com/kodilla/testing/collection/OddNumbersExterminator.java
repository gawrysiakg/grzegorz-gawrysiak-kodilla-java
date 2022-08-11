package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer theInt: numbers) {
            if (theInt % 2 == 0) {
                evenNumbers.add(theInt);
            }
        }
        return evenNumbers;
    }
}
