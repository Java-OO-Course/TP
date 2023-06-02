package cmo.lab.shapes;

public class Point {

    private int x;
    private int y;

    public Point(int aX, int aY)
    {
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
