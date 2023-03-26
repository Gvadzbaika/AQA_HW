package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.SquareEq.solve;
import static org.junit.Assert.assertArrayEquals;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите а: ");
        a = in.nextDouble();
        System.out.println("Введите b: ");
        b = in.nextDouble();
        System.out.println("Введите c: ");
        c = in.nextDouble();
        double res[] = solve(a, b, c);
        if (res.length == 2) {
            System.out.println("Уравнение ax^2 + bx + c = 0 имеет корни: \n" +
                    "x1 = " + res[0] + "\nx2 = " + res[1]);
        }
        else if (res.length == 1){
            System.out.println("Уравнение ax^2 + bx + c = 0 имеет один корень: \n" +
                    "x1 = " + res[0]);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}