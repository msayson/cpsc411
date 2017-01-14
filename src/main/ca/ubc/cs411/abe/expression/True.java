package ca.ubc.cs411.abe.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.TVal;
import ca.ubc.cs411.abe.value.Value;

public class True extends ABE {
    @Override
    public Value interp() { return new TVal(); }

    @Override
    public Type typeOf() { return Type.BOOL; }

    @Override
    public String toString() { return "True"; }
}
