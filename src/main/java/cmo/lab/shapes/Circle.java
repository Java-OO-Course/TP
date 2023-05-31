package cmo.lab.shapes;

public class Circle extends GeometricShape {

    private Point origin;
    private int radius;

    public Circle(Point aOrigin, int aRadius)
    {
        origin = aOrigin;
        radius = aRadius;
    }

    public Circle(int aOriginX, int aOriginY, int aRadius)
    {
        this(new Point(aOriginX, aOriginY), aRadius);
    }

    public Point getOrigin() {
        return origin;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int area() {
        // Le cast ici est peu précis, ça ne prend que la partie entière du nombre.
        // Une autre façon de faire serait d'utiliser Math.round();
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int perimeter() {
        return (int) (2 * Math.PI * radius);
    }

}
