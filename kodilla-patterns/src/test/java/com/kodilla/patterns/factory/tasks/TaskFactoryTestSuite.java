package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("Shopping lingerie", shoppingTask.getTaskName());
        Assert.assertEquals("I'm buying 3.0 pijamas", shoppingTask.executeTask());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertEquals("I'm painting wall in navy blue", paintingTask.executeTask());
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertEquals("I'm driving to Florence by my Maserati", drivingTask.executeTask());
        Assert.assertFalse(drivingTask.isTaskExecuted());
    }
}
