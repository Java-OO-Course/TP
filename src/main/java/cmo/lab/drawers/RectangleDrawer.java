package cmo.lab.drawers;

import cmo.lab.shapes.Rectangle;

import java.awt.*;

public class RectangleDrawer extends GeometricShapeDrawer{

    public RectangleDrawer(Rectangle aShape) {
        super(aShape);
    }

    @Override
    public void drawOn(Graphics g) {
        Rectangle r = (Rectangle) shape;
        g.drawRect(r.getOrigin().getX(), r.getOrigin().getY(), r.width(), r.height());
    }
}
