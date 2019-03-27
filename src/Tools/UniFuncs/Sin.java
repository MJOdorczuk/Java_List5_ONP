package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Sin extends UniFunc {
    public Sin() {
        super((v) -> Math.sin(v), "sin");
    }
}
