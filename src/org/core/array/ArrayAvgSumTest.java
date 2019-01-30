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

        boolean isFail=true,isValid=true;
        for(int i=0;i<marks.length;i++) {
            if(marks[i]>=0 && marks[i]<=100) {
                if (marks[i] < 35) {
                    isFail = false;
                    break;
                }
            }else{
                System.out.println("invalid data");
                isValid=false;
                break;
            }
        }
        int sum=0;
        for(int i=0;i<marks.length;i++) {

            sum=sum+marks[i];// marks[i]==> value
        }
        if(isValid){
            double avg=sum/marks.length;
            System.out.println("avg"+avg);
        }

    }
}
