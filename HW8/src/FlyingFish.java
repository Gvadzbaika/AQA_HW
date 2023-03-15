import animals.Fish;

public class FlyingFish extends Fish implements Flyable, Swimmable {
    public FlyingFish(int size) {
        super(size);
    }
}
