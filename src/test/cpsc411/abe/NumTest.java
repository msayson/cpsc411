package cpsc411.abe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumTest {
    @Test
    public void toString_NumberExpression() throws Exception {
        ABE num = new Num(5);
        assertThat(num.toString()).isEqualTo("Num(5)");
    }

    @Test
    public void interp() throws Exception {
        int intVal = 5;
        ABE num = new Num(intVal);
        assertThat(num.interp()).isEqualTo(new NVal(intVal));
    }

}