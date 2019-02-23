package org.corejava.test;

import java.util.Scanner;

public class FallThroughInsideTest {

    public static  void  main(String[] args){
        //System.out.println("hi");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int input=sc.nextInt();
        switch (input){
            case 0:
                System.out.println("output-0 ");

            case 1:
                System.out.println(" output -1");
                break;
            case 2:
                System.out.println("output - 2");
                break;
            case 3:
                System.out.println(" output -3");
                default:
                    System.out.println(" output -default");
        }
    }
}

/**
 * input->0==> output-0 ,output-1
 *
 */