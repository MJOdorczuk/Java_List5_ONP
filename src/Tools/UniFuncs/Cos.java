package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Cos extends UniFunc {
    public Cos() {
        super(value -> Math.cos(value), "cos");
    }
}
