package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Abs extends UniFunc {
    public Abs() {
        super((v) -> v < 0 ? -v : v, "abs");
    }
}
