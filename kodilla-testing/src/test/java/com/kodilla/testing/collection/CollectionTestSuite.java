package com.kodilla.testing.collection;

import com.kodilla.testing.com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        Assert.assertEquals(new ArrayList<Integer>(), result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        ArrayList<Integer> testList = new ArrayList<Integer>(){{
            add(2);
            add(4);
        }};
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(normalList);
        Assert.assertEquals(testList, result);
    }
}
