package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Acot extends UniFunc {
    public Acot() {
        super(value -> Math.atan(1/value), "acot");
    }
}
