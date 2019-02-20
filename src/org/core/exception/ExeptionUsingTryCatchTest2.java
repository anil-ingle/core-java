package org.core.exception;

public class ExeptionUsingTryCatchTest2 {

    public static void main(String[] args) {
        // without handling code
        /*
        System.out.println("line-1");
        System.out.println("line-2");
        System.out.println(10 / 0);
        System.out.println("line -4");

        */

        // with handling code

        try {
            System.out.println("line-1");
            System.out.println("line-2");

        } catch (ArithmeticException e) {
            System.out.println(10 * 2);
        }
        System.out.println("line -4");

    }
}
/*
1. Within try block if any where Exception raise then rest of try block wont be execute even though we handle
   that Exception.
2. If any Statement(code) which is not part of try block and raise exception then it is always abnormal termination
 */