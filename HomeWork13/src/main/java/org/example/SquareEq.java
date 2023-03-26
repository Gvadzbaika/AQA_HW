package org.example;
import static java.lang.Math.*;
public class SquareEq {
    // Точность вычислений
    public static final double DELTA = 0.000000001;

    public static double[] solve(double a, double b, double c) throws AnyXException {
        // Обработка вырожденных случаев
        if (abs(a) < DELTA) {
            if (abs(b) < DELTA) {
                if (abs(c) < DELTA)
                    throw new AnyXException();
                return new double[]{};
            }
            return new double[]{-c / b};
        }

        //дискриминант
        double D = pow(b, 2) - 4 * a * c;

        // Если D = 0 -> одно решение
        if (abs(D) < DELTA) {
            return new double[]{-b / (2 * a)};
        }

        // Если D > 0 -> 2 решения
        if (D > 0) {
            return new double[]{
                    (-b - sqrt(D)) / (2 * a),
                    (-b + sqrt(D)) / (2 * a)
            };
        }
        // Нет решений
        return new double[]{};
    }

}
