package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.visitor.InterpVisitor;
import ca.ubc.cs411.abevisitor.visitor.TypeOfVisitor;
import ca.ubc.cs411.abevisitor.visitor.Visitor;

public class Sub extends ABE {
    public final ABE lhs, rhs;

    public Sub(ABE lhs, ABE rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value interp() { return new InterpVisitor().visit(this); }

    @Override
    public Type typeOf() { return new TypeOfVisitor().visit(this); }

    @Override
    public <T> T accept(Visitor<T> visitor) { return visitor.visit(this); }

    @Override
    public String toString() {
        return "Sub(" + lhs + "," + rhs + ")";
    }
}
