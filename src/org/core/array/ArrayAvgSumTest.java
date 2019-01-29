package org.core.array;

import java.util.Scanner;

public class ArrayAvgSumTest {
    public static void main(String[] args) {
        int[] marks=new int[3];// decal size3
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.println("enter mark");
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<marks.length;i++) {
            sum=sum+marks[i];// marks[i]==> value
        }
        System.out.println(sum);
    }
}
