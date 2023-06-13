package cmo.lab.creators;

import cmo.lab.shapes.Circle;
import cmo.lab.shapes.GeometricShape;

public class CircleCreator extends CLIShapeCreator{

    @Override
    public GeometricShape command() {
        System.out.println("Creation of a circle");
        System.out.print("Origin X: ");
        int originX = Integer.parseInt(cli.scanCommand());
        System.out.print("Origin Y: ");
        int originY = Integer.parseInt(cli.scanCommand());
        System.out.print("Radius: ");
        int radius = Integer.parseInt(cli.scanCommand());
        return new Circle(originX, originY, radius);
    }
}
