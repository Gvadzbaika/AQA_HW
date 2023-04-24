package org.example;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertArrayEquals;

public class SquareEqTest {
    //проверка уравнения с одним решением
    @Test
    public void oneSolutionTest() {
        SquareEq roots =  new SquareEq();
        Roots res = roots.solve(1,4,4);
        Assertions.assertEquals(1, res.getNumOfRoots());
    }
    // когда два решения уравнения
    @Test
    public void twoSolutionsTest() {
        SquareEq roots =  new SquareEq();
        Roots res = roots.solve(3,4,1);
        Assertions.assertEquals(2, res.getNumOfRoots());

    }
    //Уравнения с дискриминантом меньше 0, у которых нет решений
    @Test
    public void noSolutionsTest() {
        SquareEq roots =  new SquareEq();
        Roots res = roots.solve(1,1,1);
        Assertions.assertEquals(0, res.getNumOfRoots());
    }
  }
