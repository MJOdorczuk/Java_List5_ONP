package Tools.BiFuncs;

import java.util.function.BiFunction;

public class Log extends BiFunc {
    public Log() {
        super((a,b) -> Math.log(b)/Math.log(a), "log");
    }
}
