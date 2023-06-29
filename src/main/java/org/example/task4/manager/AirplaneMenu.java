package org.example.task4.manager;

import org.example.task4.planes.BombardierGlobalXRS6000;
import org.example.task4.planes.Falcon2000;
import org.example.task4.planes.LightPlane;
import org.example.task4.planes.Plane;
import org.example.task4.utils.Angar;

import java.util.Scanner;

public class AirplaneMenu extends Angar {
    private static Reader reader = new ConsoleReader();

    public void processMenuOptions() {
        int choice;


        do {
            printMenu();
            choice = reader.readInteger();

            switch (choice) {
                case 1:
                    System.out.println("You want to buy the plane");
                    Plane newPlane1 = new BombardierGlobalXRS6000();
                    Manager.angar.addNewPlane(newPlane1);
                    break;
                case 2:
                    System.out.println("You want to buy the plane");
                    Plane newPlane2 = new Falcon2000() {
                    };
                    Manager.angar.addNewPlane(newPlane2);
                    break;
                case 3:
                    System.out.println("You want to sell the plane");
                    System.out.println("Please select the plane: ");
                    Manager.angar.listOfPlanes();
                    int indexOfPlaneToRemove = getIndexOfPlaneToRemove();
                    Manager.angar.removePlane(indexOfPlaneToRemove);

                    break;
                case 4:
                    System.out.println("The list of existing planes: ");
                    Manager.angar.listOfPlanes();
                    break;
                case 0:
                    System.out.println("Cancel the program");
                    break;
                default:
                    System.out.println("Incorrect chose. Please select the menu item: ");
            }
            System.out.println();
        } while (choice != 0);

    }

    private void printMenu() {
        System.out.println("Menu: ");
        System.out.println("1. Buy the Bombardier");
        System.out.println("2. Buy the Falcon");
        System.out.println("3. Sell the plane");
        System.out.println("4. The list of existing planes");
        System.out.println("0. Cancel");
        System.out.print("Make your choice: ");
    }

    private int getIndexOfPlaneToRemove() {
        int index = 0;
        int sizeOfAngar = Manager.angar.getSizeOfAngar();
        boolean isIndexValid = false;
        while (!isIndexValid) {
            index = reader.readInteger();
            isIndexValid = index > 0 && index <= sizeOfAngar;
            if (!isIndexValid) {
                System.out.println("Please enter correct number: ");
            }
        }
        return index;
    }


}
