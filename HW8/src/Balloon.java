import transport.Plane;
import transport.Transport;

public class Balloon extends Plane implements Flyable {
    public Balloon(int speed, String color, String name) {
        super(speed, color, name);
    }
}
