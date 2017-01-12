package ca.ubc.cs411.abe;

public class True extends ABE {
    @Override
    public Value interp() { return new TVal(); }

    @Override
    public Type typeOf() { return Type.BOOL; }

    @Override
    public String toString() { return "True"; }
}
