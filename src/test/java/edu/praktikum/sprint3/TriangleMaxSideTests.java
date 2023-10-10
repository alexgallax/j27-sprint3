package edu.praktikum.sprint3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleMaxSideTests {

    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(10, 2, 5);

        assertEquals("Максимальная сторона треугольника вычислена неверно",
                10, triangle.maxSide());
    }
}
