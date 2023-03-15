import animals.Bird;

public class Dove extends Bird implements Flyable {
    public Dove(String name, String color) {
        super(name, color);
    }

    @Override
    public String voice() {
        return "oof -oof-oof!";
    }
}
