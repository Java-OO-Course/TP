package cmo.lab.creators;

import cmo.lab.shapes.GeometricShape;

import java.util.HashMap;
import java.util.Map;

public class GeoFormCreator {

    private CommandLineInterface cli;
    private Map<String, CLIShapeCreator> commands;

    public GeoFormCreator()
    {
        cli = new CommandLineInterface();
        commands = new HashMap<>();
        commands.put("RECTANGLE", new RectangleCreator());
        commands.put("CIRCLE", new CircleCreator());
        commands.put("TRIANGLE", new TriangleCreator());
        commands.put("SQUARE", new SquareCreator());
    }

    public GeometricShape create() throws UnknownCommand
    {
        System.out.print("Please write a form to create (RECTANGLE, SQUARE, CIRCLE, TRIANGLE): ");
        String shape = cli.scanCommand();
        if(!commands.containsKey(shape))
        {
            throw new UnknownCommand(shape);
        }
        return create(shape);
    }

    /**
     * Regardez dans la classe Exemple (dans le package cmo.lab) pour voir comment la méthode sera activée.
     */
    public GeometricShape create(String aShape)
    {
        try
        {
            return commands.get(aShape).command();
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Error, geometric shapes creation requires arguments of type integer, please retry.");
            return create(aShape);
        }

    }

}
