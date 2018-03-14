package Rides;

public class QuadBike extends Vehicle {

    private int engineCapacity;

    public QuadBike(int averageSpeed, int engineCapacity) {
        super(averageSpeed);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
