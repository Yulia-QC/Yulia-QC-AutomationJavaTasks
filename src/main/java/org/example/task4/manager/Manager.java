package org.example.task4.manager;

import org.example.task4.utils.Angar;

public class Manager {
    public static Angar angar = new Angar();

    public static void main(String[] args) {
        AirplaneMenu menu = new AirplaneMenu();
        menu.processMenuOptions();
    }
}
