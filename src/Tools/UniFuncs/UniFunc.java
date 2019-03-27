package Tools.UniFuncs;

import ONPExceptions.ONPException;
import ONPExceptions.ONP_NotEnoughArguments;
import Tools.Function;

import java.util.function.DoubleFunction;

public class UniFunc extends Function {

    private final DoubleFunction<Double> operator;

    public UniFunc(DoubleFunction<Double> operator, String call) {
        super(call);
        this.operator = operator;
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public double calculate() throws ONPException {
        if(missingArguments() > 0) throw new ONP_NotEnoughArguments();
        return operator.apply(argumentsList[0]);
    }
}
