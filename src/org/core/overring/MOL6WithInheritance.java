package org.core.overring;

class A1 {
    void m1(float f) {
        System.out.println("A float-args");
    }
}

class B1 extends A1 {
    void m1(int i) {
        System.out.println("B int-args");
    }
}

public class MOL6WithInheritance {

    public static void main(String[] args) {
        B1 b = new B1();
        b.m1(50); // B-int-args
        b.m1('a');// B-int-args
        b.m1(50L); // A-float-args

        System.out.println("---------------------");

        A1 a = new B1();
        a.m1(50);// A-float-args
        a.m1('a'); //A-float-args
        a.m1(50L);//A-float-args

    }

}
