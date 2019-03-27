package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Ln extends UniFunc {
    public Ln() {
        super(value -> Math.log(value), "ln");
    }
}
