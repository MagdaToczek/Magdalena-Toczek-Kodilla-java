package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite extends AbstractTask {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactoryTestSuite test = new TaskFactoryTestSuite();
        Task testTask = test.createTask("SHOPPING");

        //Then
        Assert.assertEquals("Shopping lingerie", testTask.getTaskName());
        Assert.assertFalse(testTask.isTaskExecuted());
    }

    @Test
    public void testExecutedShoppingTask() {
        //Given
        TaskFactoryTestSuite test = new TaskFactoryTestSuite();
        Task testTask = test.createTask("SHOPPING");

        //When
        testTask.executeTask();

        //Then
        Assert.assertEquals("Shopping lingerie", testTask.getTaskName());
        Assert.assertTrue(testTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactoryTestSuite test = new TaskFactoryTestSuite();
        Task testTask = test.createTask("PAINTING");

        //Then
        Assert.assertEquals("Painting", testTask.getTaskName());
        Assert.assertFalse(testTask.isTaskExecuted());
    }

    @Test
    public void testExecutedPaintingTask() {
        //Given
        TaskFactoryTestSuite test = new TaskFactoryTestSuite();
        Task testTask = test.createTask("PAINTING");

        //When
        testTask.executeTask();

        //Then
        Assert.assertEquals("Painting", testTask.getTaskName());
        Assert.assertTrue(testTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactoryTestSuite test = new TaskFactoryTestSuite();
        Task testTask = test.createTask("DRIVING");

        //Then
        Assert.assertEquals("Driving", testTask.getTaskName());
        Assert.assertFalse(testTask.isTaskExecuted());
    }

    @Test
    public void testExecutedDrivingTask() {
        //Given
        TaskFactoryTestSuite test = new TaskFactoryTestSuite();
        Task testTask = test.createTask("DRIVING");

        //When
        testTask.executeTask();

        //Then
        Assert.assertEquals("Driving", testTask.getTaskName());
        Assert.assertTrue(testTask.isTaskExecuted());
    }
}
