package org.core.fundamental;

public class EqualityOperator {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(true==false);
        // project
        if(a==b){
            System.out.println("operation");
        }
        if(a!=b){
            System.out.println("condtn operation");
        }
    }
}
