package org.core.overring;
class Parent5{
     void m1(){
        System.out.println("P");
    }
}
class Child5 extends Parent5{
    public void m1(){
        System.out.println("C");
    }
}
public class OverrideExample5 {
    public static void main(String[] args) {
        Parent5 p=new Child5();
        p.m1();
    }
}
