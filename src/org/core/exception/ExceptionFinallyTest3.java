package org.core.exception;

public class ExceptionFinallyTest3 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        }  finally {
            System.out.println("executed");
        }
    }
}
/*
1.Java finally block is a block that is used to execute important code such as
 closing connection, stream etc.

 2.Java finally block is always executed whether exception is handled or not.
 */