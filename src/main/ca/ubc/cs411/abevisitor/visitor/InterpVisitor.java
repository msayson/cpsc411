package ca.ubc.cs411.abevisitor.visitor;

import ca.ubc.cs411.abe.value.FVal;
import ca.ubc.cs411.abe.value.NVal;
import ca.ubc.cs411.abe.value.TVal;
import ca.ubc.cs411.abe.value.Value;
import ca.ubc.cs411.abevisitor.expression.*;

public class InterpVisitor implements Visitor<Value> {

    public Value visit(Num nm) {
        return new NVal(nm.n);
    }

    public Value visit(Add ad) {
        return new NVal(ad.lhs.accept(this).toNum() + ad.rhs.accept(this).toNum());
    }

    public Value visit(Sub sub) {
        return new NVal(sub.lhs.accept(this).toNum() - sub.rhs.accept(this).toNum());
    }

    public Value visit(True tr) {
        return new TVal();
    }

    public Value visit(False fl) {
        return new FVal();
    }

    public Value visit(If ifExpr) {
        Value predVal = ifExpr.pred.accept(this);
        if (predVal.toBool()) {
            return ifExpr.conseq.accept(this);
        }
        return ifExpr.altern.accept(this);
    }
}
