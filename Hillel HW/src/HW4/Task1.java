package HW4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String reply;
        reply = "yes";
        Scanner s = new Scanner(System.in);
        while (reply.equals("yes")) {
            System.out.print("""
                    Which shape you want to draw?
                    1. Rectangle
                    2. Right Triangle
                    3. Left Triangle
                    4. Triangle
                    Enter number of shape:
                    """);
            int shape = s.nextInt();
            switch (shape) {
                case 1 -> {
                    System.out.println("You select 1. Rectangle\n");
                    System.out.print("Please enter height\n");
                    int h = s.nextInt();
                    System.out.print("Please enter width\n");
                    int width = s.nextInt();
                    printRectangle(h,width);
                }
                case 2 -> {
                    System.out.println("You select 2. Right Triangle\n");
                    System.out.print("Please enter height\n");
                    int h = s.nextInt();
                    printRightTriangle(h);
                }
                case 3 -> {
                    System.out.println("You select 3. Left Triangle\n");
                    System.out.print("Please enter height\n");
                    int h = s.nextInt();
                    printLeftTriangle(h);
                }
                case 4 -> {
                    System.out.println("You select 4. Triangle");
                    System.out.print("Please enter height\n");
                    int h = s.nextInt();
                    printTriangle(h);
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
    }
    public static String printRectangle(int h, int width) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return null;
    }

    public static String printRightTriangle(int h) {
        for (int r = 1; r <= h; r++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return null;
    }
    public static String printLeftTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return null;
    }
    public static String printTriangle(int h) {
        for (int i = 0; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return null;
    }
}

