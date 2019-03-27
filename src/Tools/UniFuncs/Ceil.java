package Tools.UniFuncs;

import java.util.function.DoubleFunction;

public class Ceil extends UniFunc {
    public Ceil() {
        super((v) -> Math.ceil(v), "ceil");
    }
}
