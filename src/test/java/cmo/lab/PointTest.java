package cmo.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testConstructor()
    {
        Point point = new Point(1,2);

        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

}