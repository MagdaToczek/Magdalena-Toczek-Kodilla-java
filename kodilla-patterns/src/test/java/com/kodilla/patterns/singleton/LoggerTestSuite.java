package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("operation 1");
        Logger.getInstance().log("operation 2");
        Logger.getInstance().log("operation 3");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("operation 3", result);
    }
}
