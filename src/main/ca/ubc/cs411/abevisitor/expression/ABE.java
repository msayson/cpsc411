package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.Visitor;

/**
 * Arithmetic and boolean expressions
 */
public abstract class ABE {
    // Returns the value produced by evaluating the expression
    public abstract Value interp();
    // Returns the type of an expression
    public abstract Type typeOf();
    public abstract Value accept(Visitor<Value> visitor);
}
