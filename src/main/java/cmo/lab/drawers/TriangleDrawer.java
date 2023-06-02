package cmo.lab.drawers;

import cmo.lab.shapes.GeometricShape;
import cmo.lab.shapes.Triangle;

import java.awt.*;

public class TriangleDrawer extends GeometricShapeDrawer{
    public TriangleDrawer(GeometricShape aShape) {
        super(aShape);
    }

    @Override
    public void drawOn(Graphics g) {
        Triangle t = (Triangle) shape;
        g.drawLine(t.getA().getX(), t.getA().getY(), t.getB().getX(), t.getB().getY());
        g.drawLine(t.getB().getX(), t.getB().getY(), t.getC().getX(), t.getC().getY());
        g.drawLine(t.getA().getX(), t.getA().getY(), t.getC().getX(), t.getC().getY());
    }
}
