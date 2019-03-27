package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Sgn extends UniFunc {
    public Sgn() {
        super((v) -> v < 0 ? -1. : v == 0 ? 0 : 1., "sgn");
    }
}
