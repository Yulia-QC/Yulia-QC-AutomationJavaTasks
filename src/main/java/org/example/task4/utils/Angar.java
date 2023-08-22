package org.example.task4.utils;

import org.example.task4.planes.Plane;

public class Angar {
    Plane[] planes;

    public void addNewPlane(Plane newPlane) {
        if (planes == null) {
            planes = new Plane[1];
            planes[0] = newPlane;

        } else {

            Plane[] newPlanes = new Plane[planes.length + 1];

            for (int i = 0; i < planes.length; i++) {
                newPlanes[i] = planes[i];
            }

            newPlanes[newPlanes.length - 1] = newPlane;

            planes = newPlanes;
        }
        System.out.println("Your new plane is added!");
        System.out.println("Your planes' name is " + newPlane.toString());
    }

    public void removePlane(int index) {

        if (planes != null) {
            Plane[] newPlanes = new Plane[planes.length - 1];

            int planeIndexInNewArray = 0;

            for (int i = 0; i < planes.length; i++) {
                if (i != index - 1) {
                    newPlanes[planeIndexInNewArray] = planes[i];
                    planeIndexInNewArray++;
                }
            }
            planes = newPlanes;
            System.out.println("Your plane has been removed from the list!");

        }

    }

    public void listOfPlanes() {
        if (planes == null || planes.length == 0) {
            System.out.println("There are no planes");
            return;
        }
        for (int i = 0; i < planes.length; i++) {
            System.out.println(i + 1 + "." + planes[i].toString());
        }
    }

    public int getSizeOfAngar() {
        return planes.length;
    }
}
