package ca.ubc.cs411.abe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class TValTest {
    @Test
    public void toBool() {
        TVal val = new TVal();
        assertThat(val.toBool()).isTrue();
    }

    @Test
    public void toNum() {
        TVal val = new TVal();
        try {
            val.toNum();
            fail("TVal.toNum() should throw an Error");
        } catch (Error e) {
            assertThat(e.getMessage()).isEqualTo("toNum: TVal is not a number");
        }
    }
}