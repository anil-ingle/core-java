package org.core.overring;

class A {
    void m1(int a) {
        System.out.println("int-arg");
    }

}

class B extends A {
    void m1(float f) {
        System.out.println("float-args");
    }
}

public class MOL5WithInheritance {

    public static void main(String[] args) {
        B b = new B();
        b.m1(50);  // int-arg
        b.m1('a'); // int-arg
        b.m1(50L); // float-arg

        System.out.println("---------------------");

        A a = new B();
        a.m1(50); // int-arg
        a.m1('a'); // int-arg
       // a.m1(50L);//  CE
    }

}
