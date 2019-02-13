package org.core.overring;

class Parent2{
    public final void m1(){
        System.out.println("Parent m1()");

    }
}
class Child2 extends Parent2{
//    public void m1(){
//        System.out.println("child m1()");
//    }
}
public class OverrideExample3 {
    public static void main(String[] args) {
        Parent2 p=new Child2();
         p.m1();
    }
}


/*

final method can not override.
 */