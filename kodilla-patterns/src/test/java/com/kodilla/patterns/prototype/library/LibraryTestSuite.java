package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testShallowCopy() throws CloneException{
        //Given
        Library library = new Library("Test Library");
        Book book1 = new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, 1, 1));
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012, 1, 1));
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", LocalDate.of(2016, 1, 1));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", LocalDate.of(2010, 1, 1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Library with shallowCopy");
        } catch (CloneNotSupportedException e) {
            throw new CloneException("Cloned is not supported");
        }

        //When
        library.getBooks().remove(book4);

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertFalse(clonedLibrary.getBooks().contains(book4));
    }

    @Test
    public void testDeepCopy() throws CloneException {
        //Given
        Library library = new Library("Test Library");
        Book book1 = new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, 1, 1));
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012, 1, 1));
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", LocalDate.of(2016, 1, 1));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", LocalDate.of(2010, 1, 1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Cloned Library with deepCopy");
        } catch (CloneNotSupportedException e) {
            throw new CloneException("Cloned is not supported");
        }

        //When
        library.getBooks().remove(book4);

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertTrue(deepClonedLibrary.getBooks().contains(book4));
    }
}
