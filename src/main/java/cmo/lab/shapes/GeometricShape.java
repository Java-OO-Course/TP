package cmo.lab.shapes;

import cmo.lab.drawers.GeometricShapeDrawer;

public abstract class GeometricShape {

    public abstract int area();
    public abstract int perimeter();

    /**
     * Cette définition de méthode indique à tous les objets du programme qu'un objet
     * de type GeometricShape sait donner le drawer qui lui correspond.
     */
    public abstract GeometricShapeDrawer newDrawer();

}
