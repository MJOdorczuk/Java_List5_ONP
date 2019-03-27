package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Sum extends BiFunc {
    public Sum() {
        super((a,b) -> a + b, "+");
    }
}
