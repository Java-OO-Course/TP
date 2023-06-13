package cmo.lab.drawers;

import cmo.lab.shapes.Rectangle;

import java.awt.*;

public class RectangleDrawer extends GeometricShapeDrawer{

    /**
     * Constructeur
     * @param aShape Ici le paramètre attendu est bien un object de la classe Rectangle.
     *               Mais quand l'attribut "shape" est ensuite utilisé dans la méthode drawOn,
     *               on est obligé de faire le cast. En effet, dans la classe abstraite on a définit
     *               la variable "shape" comme ayant le type GeometricShape.
     */
    public RectangleDrawer(Rectangle aShape) {
        super(aShape);
    }

    @Override
    public void drawOn(Graphics g) {
        Rectangle r = (Rectangle) shape;
        g.drawRect(r.getOrigin().getX(), r.getOrigin().getY(), r.width(), r.height());
    }
}
