import animals.Mammals;

public class Cat extends Mammals implements Walkable {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "Meow!";
    }
}
