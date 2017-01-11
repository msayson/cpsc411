package ca.ubc.cs411.abe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class NValTest {
    @Test
    public void toBool() {
        NVal val = new NVal(5);
        try {
            val.toBool();
            fail("NVal.toBool() should throw an Error");
        } catch (Error e) {
            assertThat(e.getMessage()).isEqualTo("toBool: NVal(5) is not a boolean");
        }
    }

    @Test
    public void toNum() {
        int intVal = 5;
        NVal val = new NVal(intVal);
        assertThat(val.toNum()).isEqualTo(intVal);
    }

    @Test
    public void isNotEqualToNonNVal() {
        int innerIntVal = 5;
        NVal nVal = new NVal(innerIntVal);
        Integer nInt = new Integer(innerIntVal);
        assertThat(nVal).isNotEqualTo(nInt);
    }

    @Test
    public void isNotEqualToNValWithDiffVal() {
        NVal nVal = new NVal(-1);
        NVal otherNVal = new NVal(1);
        assertThat(nVal).isNotEqualTo(otherNVal);
    }

    @Test
    public void isEqualToNValWithSameVal() {
        int innerIntVal = 5;
        NVal nVal = new NVal(innerIntVal);
        NVal otherNVal = new NVal(innerIntVal);
        assertThat(nVal).isEqualTo(otherNVal);
    }

    @Test
    public void isEqualToSelf() {
        NVal nVal = new NVal(5);
        assertThat(nVal).isEqualTo(nVal);
    }
}