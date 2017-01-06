package cpsc411.ae;

/**
 * Subtraction expressions
 */
public class Sub extends AE {
    public final AE leftAE;
    public final AE rightAE;

    public Sub(AE leftAE, AE rightAE) {
        this.leftAE = leftAE;
        this.rightAE = rightAE;
    }

    @Override
    public String toString() {
        return "Sub(" + leftAE + "," + rightAE + ")";
    }

    @Override
    public int interp() {
        return leftAE.interp() - rightAE.interp();
    }
}
