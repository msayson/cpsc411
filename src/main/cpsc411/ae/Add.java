package cpsc411.ae;

/**
 * Addition expressions
 */
public class Add extends AE {
    public final AE leftAE;
    public final AE rightAE;

    public Add(AE leftAE, AE rightAE) {
        this.leftAE = leftAE;
        this.rightAE = rightAE;
    }

    @Override
    public String toString() {
        return "Add(" + leftAE + "," + rightAE + ")";
    }

    @Override
    public int interp() {
        return leftAE.interp() + rightAE.interp();
    }
}
