package cmo.lab.creators;

import cmo.lab.shapes.GeometricShape;

/**
 * TODO: TP3 exercice 2
 * Cette classe abstraite doit être étendue par des classes qui implémenteront la méthode "command()".
 */
public abstract class CLIShapeCreator {

    protected CommandLineInterface cli;

    public CLIShapeCreator()
    {
        cli = new CommandLineInterface();
    }

    /**
     * Les implémentations de cette méthode doivent permettre à l'utilisateur
     * de définir depuis la console les paramètres de création d'une forme géométrique.
     */
    public abstract GeometricShape command();

}
