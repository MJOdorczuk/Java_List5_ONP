package Tools;

import ONPExceptions.ONPException;
import ONPExceptions.ONP_TooMuchArguments;

public abstract class Function extends Symbol implements Funcional{
    protected double[] argumentsList = new double[arity()];
    private int argumentsGiven = 0;
    protected final String call;

    protected Function(String call) {
        this.call = call;
    }


    @Override
    public int missingArguments() {
        return arity() - argumentsGiven;
    }

    @Override
    public void addArgument(double argument) throws ONPException {
        if(argumentsGiven < arity())
            argumentsList[argumentsGiven++] = argument;
        else throw new ONP_TooMuchArguments();
    }

    @Override
    public String call()
    {
        return call;
    }
}
