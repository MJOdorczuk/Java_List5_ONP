package Tools.miscs;

import ONPExceptions.ONP_EmptyStack;

import java.util.ArrayDeque;

public class UVStack {
    private final ArrayDeque<String> vals = new ArrayDeque<>();

    public void push(String val){vals.push(val);}

    public String pop() throws ONP_EmptyStack {
        if(vals.isEmpty()) throw new ONP_EmptyStack();
        else return vals.pop();
    }
}
