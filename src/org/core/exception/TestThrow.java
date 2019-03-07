package org.core.exception;

public class TestThrow {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
/*
1. Sometimes we create Exception object manually and handover to the jvm for these
 we have to use throw keyword.
2.main objective--->handover the our created exception obj to jvm manually.

 */