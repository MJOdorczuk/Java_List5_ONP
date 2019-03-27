package Tools.miscs;

import ONPExceptions.ONP_VariableNotSet;

import java.util.TreeMap;

public class Set {
    private final TreeMap<String,Double> varSet = new TreeMap<>();

    public void put(String name, double val)
    {
        varSet.put(name,val);
    }

    public double get(String name) throws ONP_VariableNotSet {
        Double ret = varSet.get(name);
        if(ret == null) throw new ONP_VariableNotSet();
        else return ret;
    }

    public boolean contains(String name)
    {
        return varSet.containsKey(name);
    }

    public void clear(){varSet.clear();}
}
