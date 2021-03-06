package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.visitor.Visitor;

/**
 * Arithmetic and boolean expressions
 */
public abstract class ABE {
    // Returns the value produced by evaluating the expression
    public abstract Value interp();
    // Returns the type of the expression
    public abstract Type typeOf();
    // Returns the result of running the expression through a given visitor
    public abstract <T> T accept(Visitor<T> visitor);
}
