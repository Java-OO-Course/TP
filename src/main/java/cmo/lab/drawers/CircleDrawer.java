package cmo.lab.drawers;

import cmo.lab.shapes.Circle;
import cmo.lab.shapes.GeometricShape;

import java.awt.*;

public class CircleDrawer extends GeometricShapeDrawer {

    public CircleDrawer(GeometricShape aShape) {
        super(aShape);
    }

    @Override
    public void drawOn(Graphics g) {
        Circle c = (Circle) shape;
        g.drawOval(c.getOrigin().getX(), c.getOrigin().getY(), c.getRadius(), c.getRadius());
    }
}
