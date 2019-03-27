package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Floor extends UniFunc {
    public Floor() {
        super((v) -> Math.floor(v), "floor");
    }
}
