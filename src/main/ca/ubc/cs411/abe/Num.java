package ca.ubc.cs411.abe;

public class Num extends ABE {
    public final int n;

    public Num(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Num(" + n + ")";
    }

    @Override
    // Returns the integer value held by the Num expression
    public Value interp() {
        return new NVal(n);
    }
}
