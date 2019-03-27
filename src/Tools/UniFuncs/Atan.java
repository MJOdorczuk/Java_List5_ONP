package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Atan extends UniFunc {
    public Atan() {
        super(value -> Math.atan(value), "atan");
    }
}
