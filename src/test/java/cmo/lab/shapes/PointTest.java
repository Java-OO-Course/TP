package cmo.lab.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PointTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    void setUp()
    {
        System.setOut(new PrintStream(output));
    }

    /**
     * Ici on attend normalement pas d'exception.
     * Mais on déclare throws WrongCoordinatesException au cas ou le code en lance une.
     * Si il y a effectivement une exception cela mettra le test en échec (de la même manière que la méthode fail()).
     * Cela évite d'utiliser des try/catch alors que ce n'est pas l'objectif du test.
     */
    @Test
    void testConstructor() throws WrongCoordinatesException
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

    /**
     * Ici on teste le fait qu'une exception est lancée.
     */
    @Test
    void testExpectedException()
    {
        Exception exception = assertThrows(WrongCoordinatesException.class, () -> {
            new Point(-1, 0); // Code qui doit lancer l'exception
        });

        // assertion vérifiant le message de test
        assertEquals("Point inferior to 0@0 does not exists", exception.getMessage());
    }

}