package cmo.lab.shapes;

public class Point {

    private int x;
    private int y;

    public Point(int aX, int aY)
    {
        if(aX < 0 || aY < 0)
        {
            throw new WrongCoordinatesException("Point inferior to 0@0 does not exists");
        }
        x = aX;
        y = aY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void print()
    {
        System.out.print("<" + x + "@" + y + ">");
    }

}
