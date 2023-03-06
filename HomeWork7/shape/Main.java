public class Main {
    public static void main(String[] args) {


        Circle c= new Circle(1);
        System.out.println(c.getRadius());
        System.out.println(c.getDiameterOfCircle());
        System.out.println(c.getArea());
        System.out.println(c.getCircumferenceOfCircle());

        EquilateralTriangle first = new EquilateralTriangle(3);
        System.out.println(first.getArea());

        IsoscelesTriangle second = new IsoscelesTriangle(3,3);
        System.out.println(second.getArea());

        RighTriangle th = new RighTriangle(3,3);
        System.out.println(th.getArea());

    }
}