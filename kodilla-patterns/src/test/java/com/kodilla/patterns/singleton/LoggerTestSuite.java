package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = new Logger();
        logger.log("operation 1");
        logger.log("operation 2");
        logger.log("operation 3");
        //When
        String result = logger.getLastLog();
        //Then
        Assert.assertEquals("operation 3", result);
    }
}
