package cpsc411.abe;

public class NVal extends Value {
    public final int n;
    public NVal(int n) {
        this.n = n;
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
