package org.core.overring;

class A3 {
    void m1(int a) {
        System.out.println("A int-arg");
    }
}

class B3 extends A3 {
    void m1(float f) {
        System.out.println("B float-args");
    }

    void m1(char ch) {
        System.out.println("B-char-args");
    }

}

public class MOL7WithInheritance {

    public static void main(String[] args) {
        B3 b = new B3();
        b.m1(50);//A int-arg
        b.m1('a');// B-char-args
        b.m1(50l);//B-float-arg

        System.out.println("---------------------");

        A3 a = new B3();
        a.m1(50);//A-int-arg
        a.m1('a');//A-int-arg
       // a.m1(50l);//CE

    }

}