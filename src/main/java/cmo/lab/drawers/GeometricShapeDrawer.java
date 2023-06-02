package cmo.lab.drawers;

import cmo.lab.shapes.*;

import java.awt.Graphics;

public abstract class GeometricShapeDrawer {

    /**
     * La variable devra être castée/convertie en sous-classe de GeometricShape
     * pour être utilisée par les sous-classes de GeometricShapeDrawer.
     */
    protected GeometricShape shape;

    public GeometricShapeDrawer(GeometricShape aShape) {
        shape = aShape;
    }

    public GeometricShape getShape() {
        return shape;
    }

    public abstract void drawOn(Graphics g);
}
