package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.NVal;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.visitor.Visitor;

public class Add extends ABE {
    public final ABE lhs, rhs;

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
    public Value accept(Visitor<Value> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Add(" + lhs + "," + rhs + ")";
    }
}
