package org.example.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static final String NUMBER_REQUIRED = "Input should be a number";
    public static Scanner reader;
    public static char operator;

    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;



        try {
            reader = new Scanner(System.in);
            System.out.print("Input first number: ");
            verifyDouble();
            num1 = reader.nextDouble();
            System.out.print("Input an operator (e.g. +, -, *, /, %: ");
            verifyOperator();
            System.out.print("Input second number: ");
            verifyDouble();
            num2 = reader.nextDouble();


            switch (operator) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                case '%':
                    ans = num1 % num2;
                    break;
                default:
                    System.out.println("Error! Enter correct operator");
                    return;
            }


            System.out.println("The result is given as follows: ");
            System.out.println(num1 + " " + operator + " " + num2 + " = " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }


    }
    private static void verifyDouble() {
        while (!reader.hasNextDouble()) {
            System.out.println(NUMBER_REQUIRED);
            reader.nextLine();
            System.out.print("Input a number: ");
        }
    }

    private static void verifyOperator() {
        boolean isSpecifiedOperator = false;
        while (!isSpecifiedOperator) {
            try {
                operator = reader.next().charAt(0);
                if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
                    System.out.print("Operator is incorrect. Please specify from list: ");
                    continue;
                }
                isSpecifiedOperator = true;
                reader.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("Operator is incorrect");

            }
        }
    }

}
