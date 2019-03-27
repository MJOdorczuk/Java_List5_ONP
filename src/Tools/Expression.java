package Tools;

import ONPExceptions.ONPException;
import Tools.BiFuncs.*;
import Tools.UniFuncs.*;
import Tools.Unions.E;
import Tools.Unions.Phi;
import Tools.Unions.Pi;
import Tools.miscs.Queue;
import Tools.miscs.Set;
import Tools.miscs.Stack;
import Tools.miscs.UVStack;

import java.util.HashMap;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Expression {
    private final HashMap<String, Supplier<Function>> calls = new HashMap<>();
    private final Queue queue = new Queue();
    private final Stack stack = new Stack();
    private final UVStack toAssign = new UVStack();
    private final Set variables;
    private final String[] onp;
    private static final Logger logger =
            Logger.getLogger(Expression.class.getName());


    /**
     * @param onp
     * @param variables
     */
    public Expression(String[] onp, Set variables)
    {
        this.onp = onp;
        this.variables = variables;
        Class<?>[] listOfInstances = {Difference.class, Log.class, Max.class,
                Min.class, Pow.class, Product.class,
                Quotient.class, Sum.class, Abs.class,
                Acot.class, Atan.class, Ceil.class,
                Cos.class, Exp.class, Floor.class,
                Frac.class, Ln.class, Sgn.class,
                Sin.class, E.class, Phi.class,
                Pi.class};
        for(Class<?> symbol : listOfInstances)
        {
            Object o = null;
            try {
                o = symbol.newInstance();
            } catch (Exception ignored) {}
            if (o instanceof Function) {
                Function f = (Function) o;
                calls.put(((Function) o).call, () -> f);
            }
        }
    }

    /**
     * @return
     * @throws ONPException
     */
    public double calculate() throws ONPException
        {
        for(String token : onp)
            if (calls.containsKey(token))
                queue.push(calls.get(token).get());
            else if (token.equals("=")) {
                double value = stack.pop();
                stack.push(value);
                variables.put(toAssign.pop(), value);
            } else {
                double value;
                try {
                    value = Double.parseDouble(token);
                    stack.push(value);
                } catch (Exception e) {
                    if (variables.contains(token)) stack.push(variables.get(token));
                    else toAssign.push(token);
                }
            }
        while (!queue.isEmpty())
        {
            Symbol symbol = queue.take();
            if(symbol instanceof Function)
            {
                Function fun = (Function) symbol;
                while (fun.missingArguments() > 0)
                    fun.addArgument(stack.pop());
                stack.push(fun.calculate());
            }
            else stack.push(symbol.calculate());
        }
        return stack.pop();
    }
}
