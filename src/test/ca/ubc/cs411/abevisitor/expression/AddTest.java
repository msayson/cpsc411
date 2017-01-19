package ca.ubc.cs411.abevisitor.expression;

import ca.ubc.cs411.abe.type.Type;
import ca.ubc.cs411.abe.value.NVal;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTest {
    @Test
    public void interp_SimpleExpression() throws Exception {
        Add expr = new Add(new Num(3), new Num(-16));
        assertThat(expr.interp()).isEqualTo(new NVal(-13));
    }

    @Test
    public void interp_CompoundExpression() throws Exception {
        Add expr = new Add(new Num(1), new Add(new Num(5), new Num(6)));
        assertThat(expr.interp()).isEqualTo(new NVal(12));
    }

    @Test
    public void typeOf_SimpleExpression() throws Exception {
        Add expr = new Add(new Num(3), new Num(-16));
        assertThat(expr.typeOf()).isEqualTo(Type.INT);
    }

    @Test
    public void typeOf_CompoundExpression() throws Exception {
        Add expr = new Add(new Num(1), new Add(new Num(5), new Num(6)));
        assertThat(expr.typeOf()).isEqualTo(Type.INT);
    }

    @Test
    public void toString_CompoundExpression() throws Exception {
        Add expr = new Add(new Num(1), new Add(new Num(5), new Num(6)));
        assertThat(expr.toString()).isEqualTo("Add(Num(1),Add(Num(5),Num(6)))");
    }
}