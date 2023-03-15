import animals.Bird;

public class Penguin extends Bird implements Swimmable,Walkable {

    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public String voice() {
        return "Aaarrr-aarrr!";
    }
}
