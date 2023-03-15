import transport.Ship;

public class Boat extends Ship implements Swimmable {
    public Boat(int speed, String color, String name) {
        super(speed, color, name);
    }
}
