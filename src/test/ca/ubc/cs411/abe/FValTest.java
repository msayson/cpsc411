package ca.ubc.cs411.abe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class FValTest {
    @Test
    public void toBool() {
        FVal val = new FVal();
        assertThat(val.toBool()).isFalse();
    }

    @Test
    public void toNum() {
        FVal val = new FVal();
        try {
            val.toNum();
            fail("FVal.toNum() should throw an Error");
        } catch (Error e) {
            assertThat(e.getMessage()).isEqualTo("toNum: FVal is not a number");
        }
    }
}