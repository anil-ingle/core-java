package org.core.overring;

class Parent1{
    private void m1(){
        System.out.println("Parent m1()");

    }
}
class Child1 extends Parent1{
    private void m1(){
        System.out.println("child m1()");
    }
        }
public class OverringExample2 {
    public static void main(String[] args) {
        Parent1 p=new Child1();
       // p.m1();
    }
}


/*

 private method can not override.
 */