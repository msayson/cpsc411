package ca.ubc.cs411.abe.value;

public class NVal extends Value {
    private final int n;
    public NVal(int n) {
        this.n = n;
    }

    @Override
    public int toNum() {
        return n;
    }

    @Override
    public boolean toBool() {
        throw new Error("toBool: " + this + " is not a boolean");
    }

    @Override
    public String toString() {
        return "NVal(" + n + ")";
    }

    @Override
    // Two NVal objects are equal iff they have the same internal value
    public boolean equals(Object other) {
        if (NVal.class.equals(other.getClass())) {
            NVal otherNVal = (NVal)other;
            return n == otherNVal.n;
        }
        return false;
    }
}
