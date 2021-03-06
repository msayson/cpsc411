package ca.ubc.cs411.abe.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.FVal;
import ca.ubc.cs411.abe.value.Value;

public class False extends ABE {
    @Override
    public Value interp() {
        return new FVal();
    }

    @Override
    public Type typeOf() { return Type.BOOL; }

    @Override
    public String toString() { return "False"; }
}
