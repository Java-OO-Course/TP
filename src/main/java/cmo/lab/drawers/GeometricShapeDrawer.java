package cmo.lab.drawers;

import cmo.lab.shapes.*;

import java.awt.Graphics;

public class GeometricShapeDrawer {

    private GeometricShape shape;

    public GeometricShapeDrawer(GeometricShape aShape) {
        shape = aShape;
    }

    public GeometricShape getShape() {
        return shape;
    }

    public void drawOn(Graphics graphics) {

    }

}
