package org.example.task4.planes;

public abstract class Plane implements Flyable {
    String name;
    int speed;
    int pasSeatsNumber;
    double loadCapacity;
    int flightRange;
    boolean bathroom;
    int maxFlightTime;

    public void fly() {

    }

    @Override
    public String toString() {
        return name;
    }


}

