package cmo.lab.painter;

import cmo.lab.drawers.GeometricShapeDrawer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Painter extends JComponent {

    private ArrayList<GeometricShapeDrawer> shapes;
    public void setShapes(ArrayList<GeometricShapeDrawer> s) {
        this.shapes = s;
    }

    public void paint(Graphics g) {
        for (GeometricShapeDrawer s : shapes) {
            s.drawOn(g);
        }
    }

}
