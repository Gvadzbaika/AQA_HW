public class Main {
    public static void main(String[] args) {
        Cutfish fish= new Cutfish(10);
        System.out.println(fish.swim());
        System.out.println(fish.voice());
        Pike fish2=new Pike(3);
        System.out.println(fish2.swim());
        Cat cat = new Cat("Barsik", 1);
        System.out.println(cat.voice());
        System.out.println(cat.getName());
        Bus bus1 = new Bus(100,"Blue","BMW");
        System.out.println(bus1.getInfo());
        System.out.println(bus1.drive());

    }
}