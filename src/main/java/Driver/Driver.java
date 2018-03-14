package Driver;

import Rides.IDrivable;

public class Driver {

    IDrivable ride;

    public Driver(IDrivable ride) {
        this.ride = ride;
    }

    public void setRide(IDrivable ride) {
        this.ride = ride;
    }

    public int drive(int distance) {
        return this.ride.driveDistance(distance);
    }

    public IDrivable getRide() {
        return ride;
    }
}
