package ca.ubc.cs411.abe.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.Value;

/**
 * Arithmetic and boolean expressions
 */
public abstract class ABE {
    // Returns the value produced by evaluating the expression
    public abstract Value interp();
    public abstract Type typeOf();
}
