package ca.ubc.cs411.abe.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.Value;

public class If extends ABE {
    private ABE pred, conseq, altern;

    public If(ABE pred, ABE conseq, ABE altern) {
        this.pred = pred;
        this.conseq = conseq;
        this.altern = altern;
    }

    @Override
    public Value interp() {
        if (pred.interp().toBool()) {
            return conseq.interp();
        }
        return altern.interp();
    }

    @Override
    public Type typeOf() {
        if (pred.typeOf() != Type.BOOL) {
            throw new Error("If constructor passed a non-Bool predicate: " + pred);
        } else if (conseq.typeOf() != altern.typeOf()) {
            throw new Error("If constructor passed consequence and alternative expressions with different types: " + conseq + ", " + altern);
        }
        return conseq.typeOf();
    }

    @Override
    public String toString() {
        return "If(" + pred + "," + conseq + "," + altern + ")";
    }
}
