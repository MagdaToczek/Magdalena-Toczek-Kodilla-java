package com.kodilla.patterns2.observer.homework;

import static org.junit.Assert.*;
import org.junit.Test;

public class TasksQueueTestSuite {
    @Test
    public void testQueue() {
        //Given
        TasksQueue queue1 = new TasksQueue("Magda Toczek");
        TasksQueue queue2 = new TasksQueue("Piotr Nowak");
        TasksQueue queue3 = new TasksQueue("Jola Konieczna");
        TasksQueue queue4 = new TasksQueue("Tomek Noga");
        Mentor mentor1 = new Mentor("Sebastian Kulka");
        Mentor mentor2 = new Mentor("Paulina Lisek");
        queue1.registerObserver(mentor1);
        queue2.registerObserver(mentor1);
        queue3.registerObserver(mentor2);
        queue4.registerObserver(mentor2);
        //When
        queue1.addTask("Zadanie 1.1");
        queue1.addTask("Zadanie 1.2");
        queue1.addTask("Zadanie 1.3");
        queue1.addTask("Zadanie 1.4");
        queue2.addTask("Zadanie 15.3");
        queue2.addTask("Zadanie 15.4");
        queue3.addTask("Zadanie 20.5");
        queue4.addTask("Zadanie 17.1");
        queue4.addTask("Zadanie 17.2");
        queue4.addTask("Zadanie 17.3");
        //Then
        assertEquals(6, mentor1.getUpdateCount());
        assertEquals(4,mentor2.getUpdateCount());
    }
}
