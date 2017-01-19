package ca.ubc.cs411.abevisitor;

public interface Visitor<X, Y> {
    Y visit(X expression);
}
