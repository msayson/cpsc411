package ca.ubc.cs411.ae;

import java.util.Arrays;

public class Main {

    private static void printArithmeticExpressionsRawAndInterpreted() {
        AE e1 = new Num(7);
        AE e2 = new Add(new Num(7), new Num(4));
        AE e3 = new Sub(new Add(new Num(7), new Num(4)), new Num(2));
        for (AE e : Arrays.asList(e1, e2, e3)) {
            System.out.println(e);
            System.out.println(e.interp());
        }
    }

    public static void main(String[] args) {
        printArithmeticExpressionsRawAndInterpreted();
    }
}
