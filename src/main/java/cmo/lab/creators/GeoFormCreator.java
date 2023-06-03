package cmo.lab.creators;

import cmo.lab.shapes.GeometricShape;

public class GeoFormCreator {

    private CommandLineInterface cli;

    public GeoFormCreator()
    {
        cli = new CommandLineInterface();
    }

    /**
     * Cette méthode demande à l'utilisateur le nom d'une forme à créer.
     * Elle doit vous servir d'exemple pour la création des sous-classes de CLIShapeCreator.
     *
     * Regardez dans la classe Exemple (dans le package cmo.lab) pour voir comment la méthode sera activée.
     */
    public GeometricShape create()
    {
        System.out.print("Choisissez une forme à créer: ");
        return create(cli.scanCommand());
    }

    /**
     * Regardez dans la classe Exemple (dans le package cmo.lab) pour voir comment la méthode sera activée.
     */
    public GeometricShape create(String aShape)
    {
        // TODO: TP3 Exercice 2.
        // Dans cette méthode vous devez faire en sorte de choisir
        // le bon CLIShapeCreator en fonction de la chaîne de
        // caractères donnée en arguments.
        // Il faudra renvoyer la forme géométrique une fois créee par
        // l'objet héritant de CLIShapeCreator.

        return null;
    }

}
