package ca.ubc.cs411.abe;

public class False extends ABE {
    @Override
    public Value interp() {
        return new FVal();
    }
}