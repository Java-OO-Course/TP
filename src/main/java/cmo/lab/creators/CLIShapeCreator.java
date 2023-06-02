package cmo.lab.creators;

import cmo.lab.shapes.GeometricShape;

public abstract class CLIShapeCreator {

    protected CommandLineInterface cli;

    public CLIShapeCreator()
    {
        cli = new CommandLineInterface();
    }

    abstract GeometricShape command();

}
