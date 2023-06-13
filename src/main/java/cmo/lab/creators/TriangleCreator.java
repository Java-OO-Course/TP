package cmo.lab.creators;

import cmo.lab.shapes.GeometricShape;
import cmo.lab.shapes.Triangle;

public class TriangleCreator extends CLIShapeCreator {

    @Override
    public GeometricShape command() {
        System.out.println("Creation of a triangle");
        System.out.print("A(x): ");
        int aX = Integer.parseInt(cli.scanCommand());
        System.out.print("A(y): ");
        int aY = Integer.parseInt(cli.scanCommand());
        System.out.print("B(x): ");
        int bX = Integer.parseInt(cli.scanCommand());
        System.out.print("B(y): ");
        int bY = Integer.parseInt(cli.scanCommand());
        System.out.print("C(x): ");
        int cX = Integer.parseInt(cli.scanCommand());
        System.out.print("C(y): ");
        int cY = Integer.parseInt(cli.scanCommand());
        return new Triangle(aX, aY, bX, bY, cX, cY);
    }

}
