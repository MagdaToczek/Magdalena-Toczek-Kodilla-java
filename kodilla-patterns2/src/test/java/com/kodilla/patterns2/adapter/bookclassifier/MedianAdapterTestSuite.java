package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003, "0001"));
        books.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012, "0002"));
        books.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001, "0003"));
        books.add(new Book("Aimee Murphy", "Rejecting the night", 2015, "0004"));
        books.add(new Book("Ryan Talley", "Gangsters and kings", 2007, "0005"));

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(2007, median);
    }
}
