package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.value.NVal;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IfTest {
    @Test
    public void interp_SimpleExpression_True() throws Exception {
        If expr = new If(new True(), new Num(3), new Num(-16));
        assertThat(expr.interp()).isEqualTo(new NVal(3));
    }

    @Test
    public void interp_SimpleExpression_False() throws Exception {
        If expr = new If(new False(), new Num(3), new Num(-16));
        assertThat(expr.interp()).isEqualTo(new NVal(-16));
    }

    @Test
    public void interp_CompoundExpression_True() throws Exception {
        Sub conseq = new Sub(new Num(6), new Num(2));
        If expr = new If(new True(), conseq, new Num(1));
        assertThat(expr.interp()).isEqualTo(new NVal(4));
    }

    @Test
    public void interp_CompoundExpression_False() throws Exception {
        If elseExpr = new If(new False(), new Num(2), new Add(new Num(-16), new Num(-3)));
        If expr = new If(new False(), new Num(1), elseExpr);
        assertThat(expr.interp()).isEqualTo(new NVal(-19));
    }

    @Test
    public void toString_CompoundPred() throws Exception {
        If expr = new If(new If(new True(), new False(), new True()), new True(), new False());
        assertThat(expr.toString()).isEqualTo("If(If(True,False,True),True,False)");
    }

    @Test
    public void toString_CompoundElse() throws Exception {
        If expr = new If(new False(), new Num(2), new Add(new Num(-16), new Num(-3)));
        assertThat(expr.toString()).isEqualTo("If(False,Num(2),Add(Num(-16),Num(-3)))");
    }
}