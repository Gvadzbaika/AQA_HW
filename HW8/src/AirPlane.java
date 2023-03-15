import transport.Plane;

public class AirPlane extends Plane implements Driveable,Flyable {
    public AirPlane(int speed, String color, String name) {
        super(speed, color, name);
    }
}
