package org.core.fundamental;

public class SumOf3ForTest {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=50;i++){
           // int sum=0;
            if(i%3==0) sum=sum+i;
        }
        System.out.println("sum of divisible of 3 "+sum);
    }
}
