import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<>();

        String reply = "yes";
        while (reply.equals("yes")) {
            int shapeNumber = getTypeOfShapes();
            double radius = 0;
            double firstSide = 0;
            double secondSide = 0;
            double thirdSide = 0;
            double foursSide=0;

            if (shapeNumber == 1) {
                radius = getRadius();
            } else if (shapeNumber == 2 | shapeNumber == 4 | shapeNumber== 6) {
                firstSide = getFirstSide();
            } else if (shapeNumber == 9) {
                firstSide = getFirstSide();
                secondSide = getSecondSide();
                thirdSide = getThirdSide();
                foursSide = getFoursSide();
            }else {
                firstSide = getFirstSide();
                secondSide = getSecondSide();
            }
            Shape shape = switch (shapeNumber) {
                case 1 -> new Circle(radius);
                case 2 -> new Diamond(firstSide);
                case 3 -> new Rectangle(firstSide,secondSide);
                case 4 -> new Square(firstSide);
                case 5 -> new Parallelogram(firstSide,secondSide);
                case 6 -> new EquilateralTriangle(firstSide);
                case 7 -> new RighTriangle(firstSide,secondSide);
                case 8 -> new IsoscelesTriangle(firstSide, secondSide);
                case 9 -> new Trapezium(firstSide,secondSide,thirdSide,foursSide);
                default -> null;
            };
        Comparator <Shape> shapeComparator = (o1, o2) -> {
           if (o1.getSquare() > o2.getSquare()) {
           return -1;
           } else if (o1.getSquare() < o2.getSquare()) {
           return 1;
           } else {
           int x = 0;
           if (o1.getPerimeter() > o2.getPerimeter()) {
           x = -1;
           return x;
           } else if (o1.getPerimeter() < o2.getPerimeter()) {
           x = 1;
           return x;
           }
           return x;
           }
         };
        shapeList.add(shape);
            System.out.println("Do you want to add one more shape?");
            System.out.println("[yes/no]");

            Scanner s = new Scanner(System.in);
            reply = s.next();

            if (reply.equals("no")) {
                shapeList.sort(shapeComparator);

                System.out.println("Created Shapes:");
                for (Shape sortedShape : shapeList) {
                    System.out.println(sortedShape.getClass().getSimpleName()
                            + "\n S = " + sortedShape.getSquare()
                            + "\n P= " + sortedShape.getPerimeter());
                }
            }
        }
    }
    private static void shapeSelection() {
        System.out.println("Please, enter number of figure you want to add: ");
        System.out.println("1. Circle.");
        System.out.println("2. Diamond.");
        System.out.println("3. Rectangle.");
        System.out.println("4. Square");
        System.out.println("5. Parallelogram.");
        System.out.println("6. EquilateralTriangle.");
        System.out.println("7. Right triangle.");
        System.out.println("8. IsoscelesTriangle.");
        System.out.println("9. Trapezium");
    }
    private static int getTypeOfShapes() {
        int shapeNumber;
        do {
            shapeSelection();
            Scanner s = new Scanner(System.in);
            shapeNumber = s.nextInt();
        } while ((shapeNumber < 1) || (shapeNumber > 9));
        return shapeNumber;
    }
    private static double getRadius() {
        double radius;
        System.out.println("Please, enter radius of your circle:");
        Scanner scanRadius = new Scanner(System.in);
        radius = scanRadius.nextInt();
        return radius;
    }
    private static double getFirstSide() {
        double firstSide;
        System.out.println("Please, enter first side of your figure:");
        Scanner scanSide = new Scanner(System.in);
        firstSide = scanSide.nextInt();
        return firstSide;
    }
    private static double getSecondSide() {
        double secondSide;
        System.out.println("Please, enter second side of your figure:");
        Scanner scanSide = new Scanner(System.in);
        secondSide = scanSide.nextInt();
        return secondSide;
    }
    private static double getThirdSide() {
        double thirdSide;
        System.out.println("Please, enter third side of your figure:");
        Scanner scanSide = new Scanner(System.in);
        thirdSide = scanSide.nextInt();
        return thirdSide;
    }
    private static double getFoursSide() {
        double foursSide;
        System.out.println("Please, enter third side of your figure:");
        Scanner scanSide = new Scanner(System.in);
        foursSide = scanSide.nextInt();
        return foursSide;
    }
}