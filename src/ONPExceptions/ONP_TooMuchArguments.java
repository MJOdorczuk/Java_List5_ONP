package ONPExceptions;

public class ONP_TooMuchArguments extends ONPException {
    public ONP_TooMuchArguments() {
        super("Tried to feed function with too much arguments");
    }
}
