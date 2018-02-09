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
        ShapeCollector figure1 = new ShapeCollector();

        //When
        figure1.addFigure(circle);

        //Then
        Assert.assertEquals(1,figure1.getShapesListQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figure1 = new ShapeCollector();

        //When
        boolean result = figure1.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figure1 = new ShapeCollector();

        //When
        boolean result = figure1.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(0,figure1.getShapesListQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figure1 = new ShapeCollector();
        figure1.addFigure(circle);

        //When
        Shape retrievedFigure = figure1.getFigure(0);

        //Then
        Assert.assertEquals(circle, retrievedFigure);
    }

    @Test
    public void testShowFigures(){
        //Given
        Shape circle = new Circle(2);
        Shape square = new Square(4);
        ShapeCollector figure1 = new ShapeCollector();
        List<Shape> expectedList = new ArrayList<Shape>(){{
            add(circle);
            add(square);
        }};
        figure1.addFigure(circle);
        figure1.addFigure(square);

        //When
        List<Shape> result = figure1.showFigures();

        //Then
        Assert.assertEquals(expectedList, result);
    }

}
