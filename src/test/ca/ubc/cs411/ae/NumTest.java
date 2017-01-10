package ca.ubc.cs411.ae;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumTest {

    @Test
    public void toString_NumberExpression() throws Exception {
        AE num = new Num(5);
        assertThat(num.toString()).isEqualTo("Num(5)");
    }

    @Test
    public void interp() throws Exception {
        AE num = new Num(5);
        assertThat(num.interp()).isEqualTo(5);
    }

}