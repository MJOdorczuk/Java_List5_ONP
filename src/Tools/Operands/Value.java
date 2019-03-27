package Tools.Operands;

import ONPExceptions.ONPException;
import Tools.Calculable;
import Tools.Symbol;

public class Value extends Symbol {

    private final double value;

    public Value(double value)
    {
        this.value = value;
    }
    @Override
    public double calculate() throws ONPException {
        return value;
    }

    @Override
    public String call() {
        return Double.toString(value);
    }
}
