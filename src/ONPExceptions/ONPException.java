package ONPExceptions;

/**
 *
 */
public abstract class ONPException extends Exception {

    private final String message;

    public ONPException(String message)
    {
        this.message = message;
    }

    public String message(){return message;}

}
