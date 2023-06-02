package cmo.lab.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void testConstructor()
    {
        Circle circle = new Circle(100,30,40);

        assertEquals(100, circle.getOrigin().getX());
        assertEquals(30, circle.getOrigin().getY());
        assertEquals(40, circle.getRadius());
    }

    @Test
    void testArea()
    {
        Circle circle = new Circle(100,30,40);

        assertEquals(5026, circle.area());
    }

    @Test
    void testPerimeter()
    {
        Circle circle = new Circle(100,30,40);

        assertEquals(251, circle.perimeter());
    }

}
