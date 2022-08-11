package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

@BeforeEach
    public void before() {
        System.out.println("\nTest Case: begin");
    }

@AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


@DisplayName("when create empty ArrayList, " +
            "then isEmpty() should return true"
)
@Test
    void testOddNumbersExterminatorEmptyList() {
    // Given
    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    List<Integer> emptyList = new ArrayList<>();
    // When
    List<Integer> result = exterminator.exterminate(emptyList);
    System.out.println("Testing empty list "+emptyList);
    System.out.println("Result "+result);
    // Then
    Assertions.assertTrue(result.isEmpty());
}

@DisplayName("when create List with some numbers, " +
            "then exterminate() method should return only even numbers"
)
@Test
   void testOddNumbersExterminatorNormalList() {
  /*
    // Given
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<25; i++) {
            randomList.add(random.nextInt(100));
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
    // When
        List<Integer> result = exterminator.exterminate(randomList);
    // Then
        for (Integer someInt:result) {
            System.out.println(someInt);
        }
  */

    //Given
    Integer[] integerArray = new Integer[] { 1, 2, 3, 4, 5, 6};
    List<Integer> numbers = new ArrayList<>(Arrays.asList(integerArray));

    Integer[] evenIntegerArray = new Integer[] {2, 4, 6};
    List<Integer> evenNumberList = new ArrayList<>(Arrays.asList(evenIntegerArray));

    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    //When
    List<Integer> result = exterminator.exterminate(numbers);
    System.out.println("Testing "+numbers);
    System.out.println("Result "+result);
    //Then
    Assertions.assertEquals(evenNumberList, result);


}
}
