package Tools.Operands;

import ONPExceptions.ONPException;
import Tools.Calculable;
import Tools.Symbol;

import java.util.HashMap;

public class Variable extends Symbol {

    private final String name;
    private final HashMap<String,Double> varList;

    public Variable(String name, HashMap<String,Double> varList) {
        this.name = name;
        this.varList = varList;
    }

    @Override
    public double calculate() throws ONPException {
        return varList.get(name);
    }

    @Override
    public String call() {
        return name;
    }
}
