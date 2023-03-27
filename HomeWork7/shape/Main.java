import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {


        String reply;
        reply = "yes";
        Scanner s = new Scanner(System.in);

        while(reply.equals("yes")) {

            System.out.print("""
                    Which shape you want to draw?
                    1.Circle
                    2.Diamond
                    3.Rectangle
                    4.Square
                    5.Parallelogram
                    6.EquilateralTriangle
                    7.IsoscelesTriangle
                    8.RighTriangle
                    Enter number of shape:
                    """);
            int shape = s.nextInt();


            switch (shape) {
                case 1 -> {
                    System.out.println("You select 1. Circle\n");
                    System.out.print("Please enter radius\n");
                    int radius = s.nextInt();
                    new Circle(radius);
                }
                case 2 -> {
                    System.out.println("You select 2. Diamond\n");
                    System.out.print("Please enter side of the Diamond\n");
                    int firstSide = s.nextInt();
                    new Diamond(firstSide);

                }
                case 3 -> {
                    System.out.println("You select 3. Rectangle\n");
                    System.out.print("Please enter first side of the Diamond\n");
                    int firstSide = s.nextInt();
                    System.out.print("Please enter second side of the Diamond\n");
                    int secondSide = s.nextInt();
                    new Rectangle(firstSide,secondSide);

                }
                case 4 -> {
                    System.out.println("You select 4. Square");
                    System.out.print("Please enter side of the Square\n");
                    int firstSide = s.nextInt();

                }
                case 5 -> {
                    System.out.println("You select 5. Parallelogram");
                    System.out.print("Please enter first side of the Parallelogram\n");
                    int firstSide = s.nextInt();
                    System.out.print("Please enter second side of the Parallelogram\n");
                    int secondSide = s.nextInt();

                }
                case 6 -> {
                    System.out.println("You select 6. Equilateral Triangle");
                    System.out.print("Please enter side of the Equilateral Triangle\n");
                    int firstSide = s.nextInt();

                }
                case 7 -> {
                    System.out.println("You select 7. Isosceles Triangle");
                    System.out.print("Please enter first side of the Isosceles Triangle\n");
                    int firstSide = s.nextInt();
                    System.out.print("Please enter second side of the Isosceles Triangle\n");
                    int secondSide = s.nextInt();

                }
                case 8 -> {
                    System.out.println("You select 8. Right Triangle");
                    System.out.print("Please enter first side of the Right Triangle\n");
                    int firstSide = s.nextInt();
                    System.out.print("Please enter second side of the Right Triangle\n");
                    int secondSide = s.nextInt();

                }
                default -> System.out.println("Unexpected value: " + shape);
            }
            System.out.println("Do you want to keep drawing? [yes/no]");
            reply = "";

            while (!reply.equals("yes") && !reply.equals("no")) {
                reply = s.nextLine();
            }
        }
        s.close();
        System.out.println("Goodbye");
    }}