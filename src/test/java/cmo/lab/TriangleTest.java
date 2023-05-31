package cmo.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void testConstructor()
    {
        Triangle triangle =new Triangle(160,30,140,10,190,10);

        assertEquals(160, triangle.getA().getX());
        assertEquals(30, triangle.getA().getY());
        assertEquals(140, triangle.getB().getX());
        assertEquals(10, triangle.getB().getY());
        assertEquals(190, triangle.getC().getX());
        assertEquals(10, triangle.getC().getY());
    }


    @Test
    void testArea()
    {
        Triangle triangle = new Triangle(160,30,140,10,190,10);

        assertEquals(300, triangle.area());
    }


    @Test
    void testPerimeter()
    {
        Triangle triangle = new Triangle(160,30,140,10,190,10);

        assertEquals(37, triangle.perimeter());
    }

}
