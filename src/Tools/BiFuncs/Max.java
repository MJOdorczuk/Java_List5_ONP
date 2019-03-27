package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Max extends BiFunc {
    public Max() {
        super((a,b) -> a > b ? a : b, "max");
    }
}
