package ONPExceptions;

public class ONP_NotEnoughArguments extends ONPException {
    public ONP_NotEnoughArguments() {
        super("Function called with not enough arguments");
    }
}
