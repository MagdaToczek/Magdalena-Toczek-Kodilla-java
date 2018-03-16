package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    private Library library = new Library("Test Library");
    private Book book1 = new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, 1, 1));
    private Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012, 1, 1));
    private Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", LocalDate.of(2016, 1, 1));
    private Book book4 = new Book("Secrets of Java", "Ian Tenewitch", LocalDate.of(2010, 1, 1));

    private Library prepareLibraryForTests () {
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        return library;
    }

    @Test
    public void testShallowCopy() throws CloneNotSupportedException {
        //Given
        Library testLibrary = prepareLibraryForTests();

        //When
        Library clonedLibrary = null;
        clonedLibrary = testLibrary.shallowCopy();
        clonedLibrary.setName("Cloned Library with shallowCopy");

        testLibrary.getBooks().remove(book4);

        //Then
        Assert.assertEquals(3, testLibrary.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertFalse(clonedLibrary.getBooks().contains(book4));
    }

    @Test
    public void testDeepCopy() throws CloneNotSupportedException {
        //Given
        Library testLibrary = prepareLibraryForTests();

        //When
        Library deepClonedLibrary = null;
        deepClonedLibrary = testLibrary.deepCopy();
        deepClonedLibrary.setName("Cloned Library with deepCopy");

        library.getBooks().remove(book4);

        //Then
        Assert.assertEquals(3, testLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertTrue(deepClonedLibrary.getBooks().contains(book4));
    }
}
