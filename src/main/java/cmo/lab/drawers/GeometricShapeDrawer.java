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

        if(shape instanceof Rectangle)
        {
            paintRectangle((Rectangle) shape, graphics);
        }

        if(shape instanceof Square)
        {
            paintRectangle((Square) shape, graphics);
        }

        if(shape instanceof Circle)
        {
            paintCircle((Circle) shape, graphics);
        }

        if(shape instanceof Triangle)
        {
            paintTriangle((Triangle) shape, graphics);
        }
    }

    void paintRectangle(Rectangle r, Graphics graphics)
    {
        graphics.drawRect(r.getOrigin().getX(), r.getOrigin().getY(), r.width(), r.height());
    }

    void paintCircle(Circle c, Graphics graphics)
    {
        graphics.drawOval(c.getOrigin().getX(), c.getOrigin().getY(), c.getRadius(), c.getRadius());
    }

    void paintTriangle(Triangle t, Graphics graphics)
    {
        graphics.drawLine(t.getA().getX(), t.getA().getY(), t.getB().getX(), t.getB().getY());
        graphics.drawLine(t.getB().getX(), t.getB().getY(), t.getC().getX(), t.getC().getY());
        graphics.drawLine(t.getA().getX(), t.getA().getY(), t.getC().getX(), t.getC().getY());
    }

}
