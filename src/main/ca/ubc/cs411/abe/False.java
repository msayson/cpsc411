package ca.ubc.cs411.abe;

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
