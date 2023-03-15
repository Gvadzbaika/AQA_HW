import animals.Mammals;

public class Dog extends Mammals implements Walkable {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "Woof!";
    }
}
