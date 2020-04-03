package com.example.service;

import lombok.Data;

import java.util.Scanner;

@Data
public class ConsoleService {
    private String expression;

    public String getExpressionFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¬ведите выражение: ");
        expression = scanner.nextLine();
        return expression;
    }

    public void printAnswer(double answer) {

    }
}
