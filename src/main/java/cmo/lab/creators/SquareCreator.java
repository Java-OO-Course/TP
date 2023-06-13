package cmo.lab.creators;

import cmo.lab.shapes.GeometricShape;
import cmo.lab.shapes.Square;

public class SquareCreator extends CLIShapeCreator {

    @Override
    public GeometricShape command() {
        System.out.println("Creation of a square");
        System.out.print("Origin X: ");
        int originX = Integer.parseInt(cli.scanCommand());
        System.out.print("Origin Y: ");
        int originY = Integer.parseInt(cli.scanCommand());
        System.out.print("Size: ");
        int size = Integer.parseInt(cli.scanCommand());
        return new Square(originX, originY, size);
    }

}