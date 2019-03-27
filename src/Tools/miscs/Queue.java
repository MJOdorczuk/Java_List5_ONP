package Tools.miscs;

import ONPExceptions.ONP_EmptyStack;
import Tools.Symbol;

import java.util.ArrayDeque;

public class Queue {
    private final ArrayDeque<Symbol> symbols = new ArrayDeque<>();

    public Queue() {
    }

    public void push(Symbol symbol){ symbols.push(symbol);}

    public Symbol take() throws ONP_EmptyStack {
        if(symbols.isEmpty()) throw new ONP_EmptyStack();
        else return symbols.poll();
    }

    public boolean isEmpty()
    {
        return symbols.isEmpty();
    }
}
