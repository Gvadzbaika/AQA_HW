import animals.Mammals;

public class Hamster extends Mammals implements Walkable {

    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "Fr-fr-fr!";
    }
}