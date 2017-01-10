package cpsc411.abe;

import java.util.Arrays;

public class Main {

    private static void printArithmeticExpressionsRawAndInterpreted() {
        ABE e1 = new Num(7);
        for (ABE e : Arrays.asList(e1)) {
            System.out.println(e);
            System.out.println(e.interp());
        }
    }

    public static void main(String[] args) {
        printArithmeticExpressionsRawAndInterpreted();
    }
}
