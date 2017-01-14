package ca.ubc.cs411.abe;

import java.util.Arrays;

public class Main {

    private static void printArithmeticExpressionsRawAndInterpreted() {
        ABE num = new Num(7);
        ABE add = new Add(new Num(7), new Num(4));
        ABE sub = new Sub(new Add(new Num(7), new Num(4)), new Num(3));
        ABE tru = new True();
        ABE fls = new False();
        ABE if1 = new If(tru, add, sub);
        ABE if2 = new If(fls, add, sub);
        ABE if3 = new If(tru, fls, tru);
        for (ABE e : Arrays.asList(num, add, sub, tru, fls, if1, if2, if3)) {
            System.out.println(e);
            System.out.println("  interprets to: " + e.interp() + ", has type: " + e.typeOf());
        }
    }

    public static void main(String[] args) {
        printArithmeticExpressionsRawAndInterpreted();
    }
}
