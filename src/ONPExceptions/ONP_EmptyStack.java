package ONPExceptions;

public class ONP_EmptyStack extends ONPException {
    public ONP_EmptyStack() {
        super("Stack of values is empty");
    }
}
