package org.core.test;

public class SumOfDigitTest {
    public  static  void main(String[] args){
        int input=370;
        int sum=0,rem=0;

        while(input>0){
            rem=input%10;
            sum=sum+rem;
            input=input/10;
            System.out.println("input  "+input);
        }
        System.out.println("sum -->"+sum);
    }
}
