package cpsc411.ae;

/**
 * Integer numbers
 */
public class Num extends AE {
    public final int n;

    public Num(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Num(" + n + ")";
    }

    @Override
    // Returns the integer value held by the Num expression
    public int interp() {
        return n;
    }
}
