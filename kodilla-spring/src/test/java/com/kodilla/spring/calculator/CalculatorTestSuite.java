package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(9, 4.5);
        double subResult = calculator.sub(9, 4.5);
        double mulResult = calculator.mul(9, 4.5);
        double divResult = calculator.div(9, 4.5);
        //Then
        Assert.assertEquals(13.5, addResult, 0);
        Assert.assertEquals(4.5, subResult, 0);
        Assert.assertEquals(40.5, mulResult, 0);
        Assert.assertEquals(2.0, divResult, 0);
    }
}
