package transport;

import transport.Transport;

public abstract class Plane extends Transport {

    public Plane(int speed, String color, String name) {
        super(speed, color, name);
    }
}
