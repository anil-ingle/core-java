package org.core.test;

import java.util.Scanner;

public class IfElseDemo {
   /*
   Check the number divided by 2 or not???
    */
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean rem = (number % 2) == 0;
        if (rem) {
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