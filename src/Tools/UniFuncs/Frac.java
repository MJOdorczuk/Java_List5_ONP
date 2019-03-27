package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Frac extends UniFunc {
    public Frac() {
        super((v) -> v - Math.floor(v), "frac");
    }
}
