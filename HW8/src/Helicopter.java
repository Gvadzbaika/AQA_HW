import transport.Plane;
import transport.Transport;

public class Helicopter extends Plane implements Flyable {
    public Helicopter(int speed, String color, String name) {
        super(speed, color, name);
    }
}
