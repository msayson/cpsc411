package ca.ubc.cs411.abe;

public class FVal extends Value {
    @Override
    public int toNum() {
        throw new Error("toNum: FVal is not a number");
    }

    @Override
    public boolean toBool() { return false; }

    @Override
    public String toString() {
        return "FVal";
    }

    @Override
    public boolean equals(Object other) {
        return FVal.class.equals(other.getClass());
    }
}
