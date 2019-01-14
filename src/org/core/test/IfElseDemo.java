package org.core.test;

public class IfElseDemo {
    // number whose divede by 2 and 5
    // 10
    public static void main(String[] args) {
        int number = 10;
        boolean rem = (number % 2) == 0;
        boolean remByFive = (number % 5) == 0;
        System.out.println("rem  " + rem);
        if (rem && remByFive) {

                System.out.println("given number is diveded 2 and 5");

        } else {
            System.out.println("given number is not 2 and 5");

        }
    }
}
