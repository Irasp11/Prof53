package org.example.Homework_Algoritms.lift;

public class Building {
    private Lift liftA;
    private Lift liftB;

    public Building(int liftAInitialFloor, int liftBInitialFloor) {
        liftA = new Lift(liftAInitialFloor);
        liftB = new Lift(liftBInitialFloor);
    }

    public void callLift(int floor) {
        Lift nearestLift;
        if (Math.abs(floor - liftA.getCurrentFloor()) <= Math.abs(floor - liftB.getCurrentFloor())) {
            nearestLift = liftA;
        } else {
            nearestLift = liftB;
        }
        if (!nearestLift.isMoving()) {
            nearestLift.moveTo(floor);
        }
    }

}
