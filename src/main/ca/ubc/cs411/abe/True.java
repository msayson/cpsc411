package ca.ubc.cs411.abe;

public class True extends ABE {
    @Override
    public Value interp() { return new TVal(); }
}
