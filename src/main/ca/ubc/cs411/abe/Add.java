package ca.ubc.cs411.abe;

public class Add extends ABE {
    private final ABE lhs;
    private final ABE rhs;

    public Add(ABE lhs, ABE rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value interp() {
        return new NVal(lhs.interp().toNum() + rhs.interp().toNum());
    }

    @Override
    public Type typeOf() {
        if (lhs.typeOf() == Type.INT && rhs.typeOf() == Type.INT) {
            return Type.INT;
        }
        throw new Error("typeOf: argument type mismatch for " + this.toString());
    }

    @Override
    public String toString() {
        return "Add(" + lhs + "," + rhs + ")";
    }
}
