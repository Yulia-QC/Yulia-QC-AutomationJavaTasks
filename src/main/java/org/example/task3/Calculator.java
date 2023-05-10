package org.example.task3;

import java.util.Scanner;

public class Calculator {
    public static final String NUMBER_REQUIRED = "Input should be a number";


    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;


        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("Input first number: ");
            num1 = reader.nextDouble();
            System.out.print("Input an operator (e.g. +, -, *, /, %: ");
            op = reader.next().charAt(0);
            System.out.print("Input second number: ");
            num2 = reader.nextDouble();


            switch (op) {
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

            System.out.print("Input second number: ");



            System.out.println("The result is given as follows: ");
            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        } catch (Exception e) {
            System.out.println(NUMBER_REQUIRED);

        }

    }
}
