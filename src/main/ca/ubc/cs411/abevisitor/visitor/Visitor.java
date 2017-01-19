package ca.ubc.cs411.abevisitor.visitor;

import ca.ubc.cs411.abevisitor.expression.*;

public interface Visitor<X> {
    X visit(Num n);
    X visit(Add a);
    X visit(Sub s);
    X visit(True t);
    X visit(False f);
    X visit(If i);
}
