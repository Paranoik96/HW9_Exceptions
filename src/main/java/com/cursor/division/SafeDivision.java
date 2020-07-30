package com.cursor.division;

import java.util.Scanner;

public class SafeDivision {
    private final Scanner scanner = new Scanner(System.in);

    public double divideByZero() {
        System.out.println("Please enter first number : ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please enter Second number : ");
        double secondNumber = scanner.nextDouble();
        while (true) {
            try {
                if (secondNumber == 0) {
                    throw new ArithmeticException("Do not enter ZERO as a Value!");
                }
                return firstNumber / secondNumber;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                if (secondNumber == 0) {
                    System.out.println("Please enter again Second number : ");
                    secondNumber = scanner.nextDouble();
                }
            }
        }
    }
}
