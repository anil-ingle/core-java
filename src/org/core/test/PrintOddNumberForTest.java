package org.core.test;

public class PrintOddNumberForTest {
    public static void main(String[] args) {
        for(int i=5;i<100;i++){
            if(i%2!=0){
                System.out.print(i+" ,");
            }
        }
    }
}
