package cmo.lab.shapes;

import cmo.lab.drawers.GeometricShapeDrawer;

import java.awt.*;

public abstract class GeometricShape {

    public abstract int area();
    public abstract int perimeter();

    public GeometricShapeDrawer newDrawer()
    {
        return new GeometricShapeDrawer(this);
    }

    public abstract void drawOn(Graphics g);

}
