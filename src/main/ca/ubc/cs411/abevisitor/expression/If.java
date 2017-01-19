package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.visitor.InterpVisitor;
import ca.ubc.cs411.abevisitor.visitor.Visitor;

public class If extends ABE {
    public final ABE pred, conseq, altern;

    public If(ABE pred, ABE conseq, ABE altern) {
        this.pred = pred;
        this.conseq = conseq;
        this.altern = altern;
    }

    @Override
    public Value interp() { return new InterpVisitor().visit(this); }

    @Override
    public Type typeOf() {
        if (pred.typeOf() != Type.BOOL) {
            throw new Error("If constructor passed a non-Bool predicate: " + pred);
        } else if (conseq.typeOf() != altern.typeOf()) {
            throw new Error("If constructor passed consequence and alternative expressions with different types: " + conseq + ", " + altern);
        }
        return conseq.typeOf();
    }

    @Override
    public Value accept(Visitor<Value> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "If(" + pred + "," + conseq + "," + altern + ")";
    }
}
