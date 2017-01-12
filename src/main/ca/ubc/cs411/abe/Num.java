package ca.ubc.cs411.abe;

public class Num extends ABE {
    private final int n;

    public Num(int n) {
        this.n = n;
    }

    @Override
    public Value interp() {
        return new NVal(n);
    }

    @Override
    public Type typeOf() { return Type.INT; }

    @Override
    public String toString() {
        return "Num(" + n + ")";
    }
}
