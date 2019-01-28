package org.core.test;

public class CompoundOperator {
    public static void main(String[] args) {
        int x=10,y=0;
        x*=10;// x=x8*10
        System.out.println(x);
        y+=8;
        System.out.println(y);
        int a,b,c,d;
        a=b=c=d=20;
        a+=b-=c;
        System.out.println(a+"  "+b+"   "+c);


    }
}
