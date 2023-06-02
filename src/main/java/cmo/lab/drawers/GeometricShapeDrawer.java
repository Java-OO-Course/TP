package cmo.lab.drawers;

import cmo.lab.shapes.*;

import java.awt.Graphics;

public abstract class GeometricShapeDrawer {

    protected GeometricShape shape;

    public GeometricShapeDrawer(GeometricShape aShape) {
        shape = aShape;
    }

    public GeometricShape getShape() {
        return shape;
    }

    public abstract void drawOn(Graphics g);
}
