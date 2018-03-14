package Rides;

public class DodgemCar extends Vehicle {

    private int numberOfSeats;

    public DodgemCar(int averageSpeed, int numberOfSeats) {
        super(averageSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
