package Tools;

import ONPExceptions.ONPException;

public interface Funcional extends Calculable {
    int arity();
    int missingArguments();
    void addArgument(double argument) throws ONPException;
}
