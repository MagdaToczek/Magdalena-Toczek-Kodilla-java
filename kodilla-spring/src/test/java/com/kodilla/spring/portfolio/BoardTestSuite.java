package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Do shopping");
        board.getInProgressList().addTask("Cooking");
        board.getDoneList().addTask("Cleaning");
        //Then
        Assert.assertTrue(board.getToDoList().containsTask("Do shopping"));
        Assert.assertTrue(board.getInProgressList().containsTask("Cooking"));
        Assert.assertTrue(board.getDoneList().containsTask("Cleaning"));
    }
}
