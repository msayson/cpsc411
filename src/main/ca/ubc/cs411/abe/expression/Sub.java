package ca.ubc.cs411.abe.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.NVal;
import ca.ubc.cs411.abe.value.Value;

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
    public Type typeOf() {
        if (lhs.typeOf() == Type.INT && rhs.typeOf() == Type.INT) {
            return Type.INT;
        }
        throw new Error("typeOf: argument type mismatch for " + this.toString());
    }

    @Override
    public String toString() {
        return "Sub(" + lhs + "," + rhs + ")";
    }
}
