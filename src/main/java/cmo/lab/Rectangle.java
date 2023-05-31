package cmo.lab;

public class Rectangle {

    private Point origin;
    private Point corner;

    public Rectangle(Point aOrigin, Point aCorner)
    {
        origin = aOrigin;
        corner = aCorner;
    }

    public Rectangle(int aOriginX, int aOriginY, int aCornerX, int aCornerY)
    {
        // this(...) dans un constructeur réfère à un autre constructeur de la classe courante.
        // Cet autre constructeur est déterminé en fonction du nombre et des types d'arguments supportés.
        this(new Point(aOriginX, aOriginY), new Point(aCornerX, aCornerY));
    }

    public Point getOrigin() {
        return origin;
    }

    public Point getCorner() {
        return corner;
    }

    public int width()
    {
        return Math.abs(corner.getX() - origin.getX());
    }

    public int height()
    {
        return Math.abs(corner.getY() - origin.getY());
    }

    public int area()
    {
        return width() * height();
    }

    public int perimeter()
    {
        return (width() + height()) * 2;
    }

    public void print()
    {
        System.out.print("Rectangle: (");
        origin.print();
        System.out.print(" , ");
        corner.print();
        System.out.print(")");
    }

}
