package ca.ubc.cs411.ae;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTest {
    @Test
    public void toString_CompoundExpression() throws Exception {
        AE expr = new Add(new Num(1), new Add(new Num(5), new Num(6)));
        assertThat(expr.toString()).isEqualTo("Add(Num(1),Add(Num(5),Num(6)))");
    }

    @Test
    public void interp_SimpleExpression() throws Exception {
        AE expr = new Add(new Num(3), new Num(-16));
        assertThat(expr.interp()).isEqualTo(-13);
    }

    @Test
    public void interp_CompoundExpression() throws Exception {
        AE expr = new Add(new Num(1), new Add(new Num(5), new Num(6)));
        assertThat(expr.interp()).isEqualTo(12);
    }

}