package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Min extends BiFunc {
    public Min() {
        super((a,b) -> a < b ? a : b, "min");
    }
}
