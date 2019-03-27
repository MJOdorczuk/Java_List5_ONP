package Tools.miscs;

import ONPExceptions.ONP_EmptyStack;

import java.util.ArrayDeque;

public class Stack {

    private final ArrayDeque<Double> vals = new ArrayDeque<>();

    public void push(double val){vals.push(val);}

    public double pop() throws ONP_EmptyStack {
        if(vals.isEmpty()) throw new ONP_EmptyStack();
        else return vals.pop();
    }
}
