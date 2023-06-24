package org.example.Homework_Algoritms.lift;

public class Lift {
    private int currentFloor;
    private boolean isMoving;

    public Lift(int initialFloor) {
        currentFloor = initialFloor;
        isMoving = false;
    }

    public void moveTo(int targetFloor) {
        isMoving = true;
        System.out.println("Lift is moving from floor " + currentFloor + " to floor " + targetFloor);
        currentFloor = targetFloor;
        isMoving = false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isMoving() {
        return isMoving;
    }

}
