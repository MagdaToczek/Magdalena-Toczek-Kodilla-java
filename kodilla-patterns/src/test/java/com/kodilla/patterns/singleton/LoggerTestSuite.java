package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getLoggerInstance().log("operation 1");
        Logger.getLoggerInstance().log("operation 2");
        Logger.getLoggerInstance().log("operation 3");
        //When
        String result = Logger.getLoggerInstance().getLastLog();
        //Then
        Assert.assertEquals("operation 3", result);
    }
}
