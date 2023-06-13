package cmo.lab.creators;

import cmo.lab.shapes.GeometricShape;
import cmo.lab.shapes.Rectangle;

public class RectangleCreator extends CLIShapeCreator {

    @Override
    public GeometricShape command() {
        System.out.println("Creation of a rectangle");
        System.out.print("Origin X: ");
        int originX = Integer.parseInt(cli.scanCommand());
        System.out.print("Origin Y: ");
        int originY = Integer.parseInt(cli.scanCommand());
        System.out.print("Corner X: ");
        int cornerX = Integer.parseInt(cli.scanCommand());
        System.out.print("Corner Y: ");
        int cornerY = Integer.parseInt(cli.scanCommand());
        return new Rectangle(originX, originY, cornerX, cornerY);
    }

}
