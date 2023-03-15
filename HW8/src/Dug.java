import animals.Bird;

public class Dug extends Bird implements Swimmable,Flyable {
    public Dug(String name, String color) {
        super(name, color);
    }

    @Override
    public String voice() {
        return "Krya-Krya!";
            }
}
