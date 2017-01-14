package ca.ubc.cs411.abe.expression;

import ca.ubc.cs411.abe.expression.ABE;
import ca.ubc.cs411.abe.expression.Num;
import ca.ubc.cs411.abe.expression.Sub;
import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.NVal;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubTest {
    @Test
    public void interp_SimpleExpression() throws Exception {
        ABE expr = new Sub(new Num(3), new Num(-16));
        assertThat(expr.interp()).isEqualTo(new NVal(19));
    }

    @Test
    public void interp_CompoundExpression() throws Exception {
        ABE expr = new Sub(new Num(1), new Sub(new Num(5), new Num(6)));
        assertThat(expr.interp()).isEqualTo(new NVal(2));
    }

    @Test
    public void typeOf_SimpleExpression() throws Exception {
        ABE expr = new Sub(new Num(3), new Num(-16));
        assertThat(expr.typeOf()).isEqualTo(Type.INT);
    }

    @Test
    public void typeOf_CompoundExpression() throws Exception {
        ABE expr = new Sub(new Num(1), new Sub(new Num(5), new Num(6)));
        assertThat(expr.typeOf()).isEqualTo(Type.INT);
    }

    @Test
    public void toString_CompoundExpression() throws Exception {
        ABE expr = new Sub(new Num(1), new Sub(new Num(5), new Num(6)));
        assertThat(expr.toString()).isEqualTo("Sub(Num(1),Sub(Num(5),Num(6)))");
    }
}