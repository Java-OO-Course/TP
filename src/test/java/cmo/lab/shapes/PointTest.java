package cmo.lab.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    void setUp()
    {
        System.setOut(new PrintStream(output));
    }

    @Test
    void testConstructor()
    {
        Point point = new Point(1,2);

        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testPrint()
    {
        Point point = new Point(1,2);

        point.print();

        assertEquals("<1@2>", output.toString());
    }

}