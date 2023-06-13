package cmo.lab.shapes;

/**
 * Cette exception est une Runtime exception car on s'attend à ce que le code appelant vérifie les
 * arguments passés à la classe Point.
 * Dans le cas où le code appelant n'aurait pas été en mesure de vérifier, on aurait étendu Exception.
 */
public class WrongCoordinatesException extends RuntimeException{

    public WrongCoordinatesException(String aMessage)
    {
        super(aMessage);
    }

}
