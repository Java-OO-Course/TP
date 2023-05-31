package cmo.lab.shapes;

public class Triangle extends GeometricShape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point aA, Point aB, Point aC)
    {
        a = aA;
        b = aB;
        c = aC;
    }

    public Triangle(int aAX, int aAY, int aBX, int aBY, int aCX, int aCY)
    {
        this(new Point(aAX, aAY), new Point(aBX, aBY), new Point(aCX, aCY));
    }
    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public int width() {
        return Math.abs(c.getX() - a.getX());
    }

    public int height() {
        return Math.abs(a.getY() - b.getY());
    }

    @Override
    public int area() {
        return (width() * height()) / 2;
    }

    @Override
    public int perimeter() {
        int ac = width();
        int ab = length(a, b);
        int bc = length(b, c);
        return ac + ab + bc;
    }

    /**
     * Utilisé uniquement pour le calcul des longueurs des segments du triangle.
     *
     * On définit ce calcul dans une fonction statique plutôt qu'une méthode car:
     * - Il ne sert qu'à la méthode {@link #perimeter() }.
     * - Les instructions exécutées n'impactent pas l'état des instances de la classe (la fonction est utilitaire).
     * - Le comportement est partagé par toutes les instances de la classe.
     *
     * Une meilleure organisation du code serait de déclarer cette fonction dans une ou plusieurs classe dédiée.
     * Cela rendrait le code réutilisable par d'éventuelles futures formes géométriques.
     */
    private static int length(Point aA, Point aB)
    {
        int aDeltaX = (aB.getX() - aA.getX()) ^ 2;
        int aDeltaY = (aB.getY() - aA.getY()) ^ 2;
        return (int) Math.sqrt(aDeltaX + aDeltaY);
    }

}
