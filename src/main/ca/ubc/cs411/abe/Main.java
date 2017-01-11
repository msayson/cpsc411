package ca.ubc.cs411.abe;

import java.util.Arrays;

public class Main {

    private static void printArithmeticExpressionsRawAndInterpreted() {
        ABE e1 = new Num(7);
        ABE e2 = new Add(new Num(7), new Num(4));
        ABE e3 = new Sub(new Add(new Num(7), new Num(4)), new Num(3));
        for (ABE e : Arrays.asList(e1, e2, e3)) {
            System.out.println(e);
            System.out.println(e.interp());
        }
    }

    public static void main(String[] args) {
        printArithmeticExpressionsRawAndInterpreted();
    }
}
