package Tools.Unions;

import java.util.function.Supplier;

public class Phi extends Union {
    public Phi() {
        super(() -> (1+Math.sqrt(5))/2, "PHI");
    }
}
