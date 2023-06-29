package org.example.task4.manager;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    public String readString(){
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextLine()){
            System.out.println("Entered value should be String");
            scanner.nextLine();
        }
        String enteredString = scanner.nextLine();

        return enteredString;

    }
    public int readInteger(){
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()){
            System.out.println("Entered value should be Integer");
            scanner.nextLine();
        }
        int enteredInt = scanner.nextInt();

        return enteredInt;
    }
    public double readDouble(){
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextDouble()){
            System.out.println("Entered value should be Double");
            scanner.nextLine();
        }
        double enteredDouble = scanner.nextDouble();

        return enteredDouble;

    }

}
