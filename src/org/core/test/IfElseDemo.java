package org.core.test;

public class IfElseDemo {
    // number whose divede by 2
    // 10
    public static void main(String[] args) {
        int number = 10;
        boolean rem = (number % 2) == 0;
        System.out.println("rem  " + rem);
        if (rem ) {
                System.out.println("given number is diveded 2 ");
        } else {
            System.out.println("given number is not 2 ");
        }
    }
}
/*
Assignment:
    print :if number is greater than 10 then print Hello if not grater than 10 then print Word
 */