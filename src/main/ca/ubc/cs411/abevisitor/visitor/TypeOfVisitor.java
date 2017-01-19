package ca.ubc.cs411.abevisitor.visitor;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abevisitor.expression.*;

public class TypeOfVisitor implements Visitor<Type> {
    @Override
    public Type visit(Num n) {
        return Type.INT;
    }

    @Override
    public Type visit(Add a) {
        if (a.lhs.accept(this) == Type.INT && a.rhs.accept(this) == Type.INT) {
            return Type.INT;
        }
        throw new Error("typeOf: argument type mismatch for " + a.toString());
    }

    @Override
    public Type visit(Sub s) {
        if (s.lhs.accept(this) == Type.INT && s.rhs.accept(this) == Type.INT) {
            return Type.INT;
        }
        throw new Error("typeOf: argument type mismatch for " + s.toString());
    }

    @Override
    public Type visit(True t) {
        return Type.BOOL;
    }

    @Override
    public Type visit(False f) {
        return Type.BOOL;
    }

    @Override
    public Type visit(If i) {
        if (i.pred.accept(this) != Type.BOOL) {
            throw new Error("If constructor passed a non-Bool predicate: " + i.pred);
        }
        Type typeOfConsequence = i.conseq.accept(this);
        if (typeOfConsequence != i.altern.accept(this)) {
            throw new Error("If constructor passed consequence and alternative expressions with different types: " + i.conseq + ", " + i.altern);
        }
        return typeOfConsequence;
    }
}
