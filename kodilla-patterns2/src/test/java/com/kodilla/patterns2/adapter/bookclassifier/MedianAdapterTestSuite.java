package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //When
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Grzegorz Kasdepke", "Bajki dla dzieci", 2009, "la00548"));
        bookSet.add(new Book("Grzegorz Kasdepke", "Mądre opowiadania", 2013, "la00887"));
        bookSet.add(new Book("Stefan Nowak", "Porady budowlane", 1995, "la000875"));
        bookSet.add(new Book("Anna Bas", "Kobieta i mężczyzna", 2021, "la0335"));
        bookSet.add(new Book("Grzegorz Krychowiak", "Wszystkie futra Krychowiaka", 2022, "la36548"));
        bookSet.add(new Book("Arkadiusz Milik", "Pudło to prawie gol", 2022, "la478922"));
        bookSet.add(new Book("Robert Lewandowski", "Życie emeryta", 2022, "la7745"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //Then
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Assert
        Assertions.assertEquals(2021, median);


    }
}
