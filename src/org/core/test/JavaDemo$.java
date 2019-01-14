package org.core.test;

public class JavaDemo$ {

    JavaDemo$() {
        System.out.println("This is constructor");
    }
// static bolock
    static {
        System.out.println("This is static boloc");
    }

    // non static block
    {
        System.out.println("This is non static boloc");
    }

    static void m1() {
        System.out.println("This is m1 ");
    }

    void  m2() {
        System.out.println("This is m2 ");

    }

    static public void main(String[] args) {
        System.out.println("This is first program");
        JavaDemo$ JavaDemo$ = new JavaDemo$();
        JavaDemo$.m2();
        m1();
        JavaDemo$.m1();
        System.out.println("This is first program end ");

    }

}
