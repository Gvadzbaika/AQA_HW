import transport.Car;

public class PassengerCar extends Car implements Driveable {
    public PassengerCar(int speed, String color, String name) {
        super(speed, color, name);
    }
}
