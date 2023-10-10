package edu.praktikum.sprint3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TrianglePerimeterTests {

    @Parameter
    public int side1;
    @Parameter(1)
    public int side2;
    @Parameter(2)
    public int side3;
    @Parameter(3)
    public int expectedResult;

    @Parameters(name = "Тест {index}: треугольник со сторонами" +
            " {0}, {1}, {2} должен иметь периметр {3}")
    public static Object[][] data() {
        return new Object[][] {
                { 2, 4, 8, 14 },
                { 1, 1, 5, 7 }
        };
    }

    @Test
    public void perimeterTest() {
        Triangle triangle = new Triangle(side1, side2, side3);

        assertEquals("Периметр треугольника вычислен неверно",
                expectedResult, triangle.perimeter());
    }
}
