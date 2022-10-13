package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
    //Given
        Library library = new Library("My Books");
        Book book1 = new Book("Wolf of the mountain", "Dylan Murphy", LocalDate.of(2003, 1, 15));
        Book book2 = new Book("Slaves of dreams", "Phoebe Pearson", LocalDate.of(2012, 11, 20));
        Book book3 = new Book("Obliteration of heaven", "Morgan Walsh", LocalDate.of(2001, 5, 20));
        Book book4 = new Book("Rejecting the night", "Aimee Murphy", LocalDate.of(2015, 4,  30));
        Book book5 = new Book("Gangsters and kings", "Ryan Talley", LocalDate.of(2007, 1, 1));
        Book book6 = new Book("Unity without duty", "Madelynn Carson", LocalDate.of(2007, 12, 20));
        Book book7 = new Book("Enemies of eternity", "Giancarlo Guerrero", LocalDate.of(2009, 12, 22));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My Books Shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My Books Deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(6, library.getBooks().size());
        assertEquals(6, clonedLibrary.getBooks().size());
        assertEquals(7, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }


}
