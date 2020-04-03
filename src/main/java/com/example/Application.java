package com.example;

import com.example.service.CalculationService;
import com.example.service.ConsoleService;
import com.example.service.ConversionService;
import com.example.service.ParseService;
import com.example.validation.SimpleValidator;

public class Application {
    public static void main(String[] args) {
        ConsoleService consoleService = new ConsoleService();
        SimpleValidator simpleValidator = new SimpleValidator();
        ConversionService conversionService = new ConversionService();
        ParseService parseService = new ParseService();
        CalculationService calculationService = new CalculationService();
        String[] expression;
        String[] expressionInReversPolishNotation;
        double answer;

        expression = conversionService.convertStringToArray(consoleService.getExpressionFromUser());
        simpleValidator.run(expression);
        expressionInReversPolishNotation = parseService.getExpressionInReversPolishNotation(expression);
        answer = calculationService.getAnswer(expressionInReversPolishNotation);
        consoleService.printAnswer(answer);
    }
}
