package cmo.lab.painter;

import cmo.lab.drawers.GeometricShapeDrawer;
import cmo.lab.shapes.*;

import javax.swing.*;
import java.util.ArrayList;

public class PainterApp {

    public static void drawShapes(ArrayList<GeometricShape> shapes) {
        ArrayList<GeometricShapeDrawer> drawers = new ArrayList<GeometricShapeDrawer>();
        for (GeometricShape shape: shapes) {
            drawers.add(shape.newDrawer());
        }
        displayShapes(drawers);
    }

    public static void displayShapes(ArrayList<GeometricShapeDrawer> shapes) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        Painter drawer = new Painter();
        drawer.setShapes(shapes);
        window.getContentPane().add(drawer);
        window.setVisible(true);
    }

    public static void main(String[] args){

        ArrayList<GeometricShape> shapes = new ArrayList<GeometricShape>();
        Rectangle r=new Rectangle(40,20,30,50);
        Square s=new Square(150,50,40);
        Circle c=new Circle(100,30,40);
        Triangle t=new Triangle(160,30,140,10,190,10);
        shapes.add(r);
        shapes.add(s);
        shapes.add(c);
        shapes.add(t);

        drawShapes(shapes);
    }
}
