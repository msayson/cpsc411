package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.NVal;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.visitor.Visitor;

public class Num extends ABE {
    public final int n;

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
    public Value accept(Visitor<Value> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Num(" + n + ")";
    }
}
