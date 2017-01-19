package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.visitor.InterpVisitor;
import ca.ubc.cs411.abevisitor.visitor.Visitor;

public class True extends ABE {
    @Override
    public Value interp() { return new InterpVisitor().visit(this); }

    @Override
    public Type typeOf() { return Type.BOOL; }

    @Override
    public Value accept(Visitor<Value> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() { return "True"; }
}
