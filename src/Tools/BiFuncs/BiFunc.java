package Tools.BiFuncs;

import ONPExceptions.ONPException;
import ONPExceptions.ONP_NotEnoughArguments;
import Tools.Function;

import java.util.function.BiFunction;

/**
 *
 */
public class BiFunc extends Function {
    private final BiFunction<Double,Double,Double> operator;

    /**
     * @param operator
     * @param call
     */
    public BiFunc(BiFunction<Double, Double, Double> operator, String call) {
        super(call);
        this.operator = operator;
    }

    /**
     * @return
     */
    @Override
    public int arity() {
        return 2;
    }

    /**
     * @return
     * @throws ONPException
     */
    @Override
    public double calculate() throws ONPException {
        if(missingArguments() > 0) throw new ONP_NotEnoughArguments();
        else return operator.apply(argumentsList[0],argumentsList[1]);
    }
}
