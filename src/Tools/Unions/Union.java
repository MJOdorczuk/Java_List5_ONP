package Tools.Unions;

import ONPExceptions.ONPException;
import Tools.Function;

import java.util.function.Supplier;

public class Union extends Function {

    private final Supplier<Double> action;

    public Union(Supplier<Double> action, String call) {
        super(call);
        this.action = action;
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public double calculate() throws ONPException {
        return action.get();
    }
}
