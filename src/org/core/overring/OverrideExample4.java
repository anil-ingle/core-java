package org.core.overring;

abstract class Parent3{
    public void m1(){
        System.out.println("child m1()");
    }
}
abstract class Child3 extends Parent3{
    public abstract void m1();
}
 class Child4 extends Child3{
    public void m1(){
         System.out.println("child4 m1()");
     }
}
public class OverrideExample4 {
    public static void main(String[] args) {
//        Parent3 p=new Child3();
//         p.m1();
    }
}


/*

 private method can not override.
 */