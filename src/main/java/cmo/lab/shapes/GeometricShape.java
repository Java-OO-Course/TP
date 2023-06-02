package cmo.lab.shapes;

import cmo.lab.drawers.GeometricShapeDrawer;

import java.awt.*;

public abstract class GeometricShape {

    public abstract int area();
    public abstract int perimeter();

    public abstract GeometricShapeDrawer newDrawer();

}
