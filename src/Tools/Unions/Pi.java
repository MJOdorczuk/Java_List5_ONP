package Tools.Unions;

import java.util.function.Supplier;

public class Pi extends Union {
    public Pi() {
        super(() -> Math.PI, "PI");
    }
}
