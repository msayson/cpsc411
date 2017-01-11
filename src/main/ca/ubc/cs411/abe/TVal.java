package ca.ubc.cs411.abe;

public class TVal extends Value {
    @Override
    public int toNum() { throw new Error("toNum: TVal is not a number"); }

    @Override
    public boolean toBool() { return true; }

    @Override
    public String toString() { return "TVal"; }

    @Override
    public boolean equals(Object other) { return TVal.class.equals(other.getClass()); }
}
