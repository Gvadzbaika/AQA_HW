package org.example;

public class SquareEq {
       public static Roots solve(double a, double b, double c) {


        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            return new Roots(x1, x2);

        } else if (d == 0) {
            double x = -b / (2 * a);
            return new Roots(x);
        } else {
            return new Roots();
        }
    }
}