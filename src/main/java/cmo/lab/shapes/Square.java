package cmo.lab.shapes;

/**
 * Cette classe est testée via RectangleTest.
 * Un carré est un rectangle qui se construit à partir d'une origine et de la taille de ses côtés.
 * Inutile de redéfinir les méthodes {@link Rectangle#width()} ou {@link Rectangle#height()}
 * car le carré en hérite le comportement.
 */
public class Square extends Rectangle {

    public Square(int aOriginX, int aOriginY, int aHeight)
    {
        super(aOriginX, aOriginY, aOriginX + aHeight, aOriginY + aHeight);
    }

}
