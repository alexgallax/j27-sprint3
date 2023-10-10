package edu.praktikum.sprint3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleSquareTests {

    @Test
    public void squareTest() {
        Triangle triangle = new Triangle(2, 3, 4);

        assertEquals("Площадь треугольника вычислен неверно", 3, triangle.square());
    }
}
