package org.example;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SquareEqTest {

    private static final double DELTA = 0.000001;

    @Test
    public void simpleTest() {
        // assertEquals( ожидаемое_значение, вычисленное значение )
        assertArrayEquals("x^2 = 0",
                new double[]{0.0},
                SquareEq.solve(1.0, 0.0, 0.0), SquareEq.DELTA);
    }
    //проверка уравнения с одним решением
    @Test
    public void oneSolutionTest() {
        assertArrayEquals("(x+1)^2 = x^2 + 2*x + 1 = 0",
                new double[]{-1.0},
                SquareEq.solve(1.0, 2.0, 1.0), DELTA);
    }
    // когда два решения уравнения
    @Test
    public void twoSolutionsTest() {
        assertArrayEquals("x^2 - 1 = 0",
                new double[]{-1.0, 1.0},
                SquareEq.solve(1.0, 0.0, -1.0), DELTA);
        assertArrayEquals("x^2 - 4 = 0",
                new double[]{-2.0, 2.0},
                SquareEq.solve(1.0, 0.0, -4.0), DELTA);
    }
    //Уравнения с дискриминантом меньше 0, у которых нет решений
    @Test
    public void noSolutionsTest() {
        assertArrayEquals("x^2 + 1 = 0",
                new double[]{},
                SquareEq.solve(1.0, 0.0, 1.0), DELTA);

        assertArrayEquals("3x^2 + 10 = 0",
                new double[]{},
                SquareEq.solve(3.0, 0.0, 10.0), DELTA);
    }
    // тест когда b != 0
    @Test
    public void twoSolutionsBNotNullTest() {
        // (x-1)(x-2) = x^2 - 3x + 2
        assertArrayEquals("x^2 - 3x + 2 = 0",
                new double[]{1.0, 2.0},
                SquareEq.solve(1.0, -3.0, 2.0), DELTA);
    }
    // a = 0
    //Квадратное уравнение превращается в линейное
    @Test
    public void zeroA() {
        assertArrayEquals("2x + 1 = 0",
                new double[]{-0.5},
                SquareEq.solve(0.0, 2.0, 1.0), DELTA);

        assertArrayEquals("x - 10 = 0",
                new double[]{10.0},
                SquareEq.solve(0.0, 1.0, -10.0), DELTA);
    }

    // Тестируем вырожденный случай: a = 0, b = 0
    @Test
    public void zeroAZeroB() {
        assertArrayEquals("1 = 0",
                new double[]{},
                SquareEq.solve(0.0, 0.0, 1.0), DELTA);
    }
    // Вырожденный случай: a = 0, b = 0, c = 0
    // Ожидаемое исключение
    @Test(expected = AnyXException.class)
    public void zeroAZeroBZeroC() {
        assertArrayEquals("0 = 0",
                new double[]{},
                SquareEq.solve(0.0, 0.0, 0.0), DELTA);
    }
}
