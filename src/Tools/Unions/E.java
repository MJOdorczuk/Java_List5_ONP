package Tools.Unions;

import java.util.function.Supplier;

public class E extends Union {
    public E() {
        super(() -> Math.E, "E");
    }
}
