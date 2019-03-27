package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Pow extends BiFunc {
    public Pow() {
        super((a,b) -> Math.pow(a,b), "^");
    }
}
