package ca.ubc.cs411.ae;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubTest {
    @Test
    public void toString_CompoundExpression() throws Exception {
        AE expr = new Sub(new Sub(new Num(5), new Num(6)), new Num(1));
        assertThat(expr.toString()).isEqualTo("Sub(Sub(Num(5),Num(6)),Num(1))");
    }

    @Test
    public void interp_SimpleExpression() throws Exception {
        AE expr = new Sub(new Num(3), new Num(-16));
        assertThat(expr.interp()).isEqualTo(19);
    }

    @Test
    public void interp_CompoundExpression() throws Exception {
        AE expr = new Sub(new Sub(new Num(5), new Num(6)), new Num(1));
        assertThat(expr.interp()).isEqualTo(-2);
    }

}