package cmo.lab.creators;


/**
 * Cette exception est utilisée uniquement dans la méthode create(...) de GeoFormCreator.
 */
public class UnknownCommand extends Exception {

    public UnknownCommand(String aCommand)
    {
        super("Error no command available for: " + aCommand);
    }
}
