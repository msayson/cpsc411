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
        return null;
    }

    @Override
    public Type visit(Sub s) {
        return null;
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
        return null;
    }
}
