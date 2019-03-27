package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Difference extends BiFunc {
    public Difference() {
        super((a,b) -> a - b, "-");
    }
}
