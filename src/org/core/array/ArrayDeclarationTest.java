package org.core.array;

import java.util.Scanner;

public class ArrayDeclarationTest {
    public static void main(String[] args) {
        int x=20,y=30;//...
        int[] a=new int[3];// array decalre
//          a[0]=20;// store
//          a[1]=30;// store
//           //a[10]=50;
//        System.out.println(a.length); // array length
//        System.out.println(a[5]);// get
        // Scanner for get system prop
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a[0]");
//        a[0] =sc.nextInt();
//        System.out.println("enter a[1]");
//        a[1] =sc.nextInt();
//        System.out.println("enter a[2]");
//        a[2] =sc.nextInt();
        for(int i=0;i<a.length;i++){
            System.out.println("enter value");
            a[i] =sc.nextInt();
        }
// print
//        System.out.print(a[0]);
//        System.out.print(a[1]);
//        System.out.print(a[2]);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
