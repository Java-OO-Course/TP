package cmo.lab.shapes;

import cmo.lab.drawers.GeometricShapeDrawer;

public abstract class GeometricShape {

    public abstract int area();
    public abstract int perimeter();

    public GeometricShapeDrawer newDrawer()
    {
        return new GeometricShapeDrawer(this);
    }

}
