package cmo.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    /**
     * Code exécuté avant chaque test.
     * Objectif, capturer le flux binaire envoyé à la sortie standard pour le {@link #testPrint()}.
     * Pour cela on vient remplacer le flux par défaut de la sortie standard par le notre (output), temporairement.
     * Le flux "output" peut ensuite être utilisé pour savoir ce qui a été envoyé via System.out.print(...).
     */
    @BeforeEach
    void setUp()
    {
        System.setOut(new PrintStream(output));
    }

    @Test
    void testConstructor()
    {
        Rectangle rectangle = new Rectangle(4, 2, 3, 1);

        assertEquals(4, rectangle.getOrigin().getX());
        assertEquals(2, rectangle.getOrigin().getY());
        assertEquals(3, rectangle.getCorner().getX());
        assertEquals(1, rectangle.getCorner().getY());
    }

    @Test
    void testWidth()
    {
        Rectangle rectangle = new Rectangle(4, 2, 3, 1);

        assertEquals( 1, rectangle.width());
    }

    @Test
    void testHeight()
    {
        Rectangle rectangle = new Rectangle(4, 2, 3, 1);

        assertEquals( 1, rectangle.height());
    }

    @Test
    void testArea()
    {
        Rectangle rectangle = new Rectangle(4, 2, 3, 1);

        assertEquals( 1, rectangle.area());
    }

    @Test
    void testPerimeter()
    {
        Rectangle rectangle = new Rectangle(4, 2, 3, 1);

        assertEquals( 4, rectangle.perimeter());
    }

    @Test
    void testPrint()
    {
        Rectangle rectangle = new Rectangle(4, 2, 3, 5);

        rectangle.print();

        // On compare le flux binaire (sa valeur transformée en chaîne de caractères), avec l'attendu.
        assertEquals( "Rectangle: (<4@2> , <3@5>)", output.toString());
    }

}