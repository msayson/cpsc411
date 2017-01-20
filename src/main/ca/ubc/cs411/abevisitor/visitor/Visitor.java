package ca.ubc.cs411.abevisitor.visitor;

import ca.ubc.cs411.abevisitor.expression.*;

public interface Visitor<T> {
    T visit(Num n);
    T visit(Add a);
    T visit(Sub s);
    T visit(True t);
    T visit(False f);
    T visit(If i);
}
