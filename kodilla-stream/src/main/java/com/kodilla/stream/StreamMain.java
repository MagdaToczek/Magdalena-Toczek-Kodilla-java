package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
import jdk.nashorn.internal.objects.NativeString;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static jdk.nashorn.internal.objects.NativeString.trim;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Zadanie 7.1
        poemBeautifier.beautify("Sample Text", (textToDecorate) -> "ABC".concat(textToDecorate).concat("ABC"));
        poemBeautifier.beautify("Sample Text", (textToDecorate) -> toUpperCase(textToDecorate));
        poemBeautifier.beautify("Sample Text", (textToDecorate) -> textToDecorate.replace("e", ""));
        poemBeautifier.beautify("Sample Text", (textToDecorate) -> textToDecorate.replaceFirst("Sample", "My Decorated"));
    }
}