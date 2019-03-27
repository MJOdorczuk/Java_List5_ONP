package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Product extends BiFunc {
    public Product() {
        super((a,b) -> a * b, "*");
    }
}
