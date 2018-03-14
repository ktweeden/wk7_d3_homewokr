package Rides;

import Rides.IDrivable;

public abstract class Vehicle implements IDrivable {
    private int averageSpeed;

    public Vehicle(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    @Override
    public int driveDistance(int distance) {
        return distance/this.averageSpeed;
    }
}
