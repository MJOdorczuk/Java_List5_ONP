package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Exp extends UniFunc {
    public Exp() {
        super(value -> Math.exp(value), "cos");
    }
}
