package ca.ubc.cs411.abe;

public class Sub extends ABE {
    private final ABE lhs;
    private final ABE rhs;

    public Sub(ABE lhs, ABE rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value interp() {
        return new NVal(lhs.interp().toNum() - rhs.interp().toNum());
    }

    @Override
    public String toString() {
        return "Sub(" + lhs + "," + rhs + ")";
    }
}
