package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figuresCollector = new ShapeCollector();

        //When
        figuresCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1,figuresCollector.getShapesListQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figuresCollector = new ShapeCollector();

        //When
        boolean result = figuresCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figuresCollector = new ShapeCollector();

        //When
        boolean result = figuresCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(0,figuresCollector.getShapesListQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figuresCollector = new ShapeCollector();
        figuresCollector.addFigure(circle);

        //When
        Shape retrievedFigure = figuresCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle, retrievedFigure);
    }
}
