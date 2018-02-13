package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for (int nr: numbers) {
            if((nr % 2) == 0) {
                oddNumbers.add(nr);
            }
        }
        return oddNumbers;
    }
}
