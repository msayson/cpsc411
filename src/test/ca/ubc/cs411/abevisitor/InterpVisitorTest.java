package ca.ubc.cs411.abevisitor;

import ca.ubc.cs411.abe.value.FVal;
import ca.ubc.cs411.abe.value.NVal;
import ca.ubc.cs411.abe.value.TVal;
import ca.ubc.cs411.abevisitor.expression.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterpVisitorTest {

    private static InterpVisitor visitor;

    @BeforeClass
    public static void initializeVisitor() {
        visitor = new InterpVisitor();
    }

    @Test
    public void visitNum() throws Exception {
        Num num = new Num(5);
        assertThat(visitor.visit(num)).isEqualTo(new NVal(5));
    }

    @Test
    public void visitAdd() throws Exception {
        Add add = new Add(new Num(1), new Num(-11));
        assertThat(visitor.visit(add)).isEqualTo(new NVal(-10));
    }

    @Test
    public void visitAdd_Compound() throws Exception {
        Add add = new Add(new Sub(new Num(5), new Num(1)), new Add(new Num(1), new Num(-11)));
        assertThat(visitor.visit(add)).isEqualTo(new NVal(-6));
    }

    @Test
    public void visitSub() throws Exception {
        Sub sub = new Sub(new Num(12), new Num(5));
        assertThat(visitor.visit(sub)).isEqualTo(new NVal(7));
    }

    @Test
    public void visitTrue() throws Exception {
        assertThat(visitor.visit(new True())).isEqualTo(new TVal());
    }

    @Test
    public void visitFalse() throws Exception {
        assertThat(visitor.visit(new False())).isEqualTo(new FVal());
    }

    @Test
    public void visitIf() throws Exception {
        ABE conseq = new Add(new Num(5), new Num(2));
        ABE altern = new Sub(new Num(5), new Num(2));
        If ifTrueExpr = new If(new True(), conseq, altern);
        assertThat(visitor.visit(ifTrueExpr)).isEqualTo(new NVal(7));
        If ifFalseExpr = new If(new False(), conseq, altern);
        assertThat(visitor.visit(ifFalseExpr)).isEqualTo(new NVal(3));
    }

}