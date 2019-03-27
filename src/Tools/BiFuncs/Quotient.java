package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Quotient extends BiFunc {
    public Quotient() {
        super((a,b) -> a/b, "/");
    }
}
