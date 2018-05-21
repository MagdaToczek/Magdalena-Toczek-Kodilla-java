package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        List<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> listFromBookSet = new ArrayList<>(bookSet);
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookList = new HashMap<>();
        for (int n = 0; n < bookSet.size(); n++) {
            bookList.put(new BookSignature(listFromBookSet.get(n).getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(listFromBookSet.get(n).getAuthor(), listFromBookSet.get(n).getTitle(), listFromBookSet.get(n).getPublicationYear()));
        }
        return medianPublicationYear(bookList);
    }
}
