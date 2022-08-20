package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
    //Given
        int[] grades = {1, 3, 3, 6, 5, 4, 4, 5, 6, 2, 1, 3, 5, 6, 1, 3, 2, 5, 6, 5 };
    //When
        double result = ArrayOperations.getAverage(grades);
        double expected = 3.8;
    //Then
        Assertions.assertEquals(expected, result);
    }
}
