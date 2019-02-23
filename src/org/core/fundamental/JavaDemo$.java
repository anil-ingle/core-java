package org.core.fundamental;

public class JavaDemo$ {

    // static block
    static {
        System.out.println("This is static block");
    }

    // non static block
    {
        System.out.println("This is non static block");
    }

    JavaDemo$() {
        System.out.println("This is constructor");
    }


    static void m1() {
        System.out.println("This is m1 ");
    }
    static public void main(String[] args) {
        System.out.println("This is first program main start");
        JavaDemo$ JavaDemo$ = new JavaDemo$();
        JavaDemo$.m2();
        m1();
        System.out.println("This is first program main end ");
    }
    // non static method instance method
    void m2() {
        System.out.println("This is m2 ");
    }
}
/*
1. Program start from main method bcoz main is callback method
2. if any static var , static block present in class then that part first execute(static variable initialize and static bloack
      execute )
3. according to above program control first come main and check if is any static var. or block here static bloack available so its execute.
4. then execute first line of main method i.e. line number 24
5. after first line here we create object then execution flow is
        a.initialize non-static class level variable
        b. execute non-static block
        c. then execute constructor
6.here we call non-static method i.e. m2() // calling m2() and execute
      note: non-static method, variable if we want call, access then compulsory we need object of
            that class. hence we create   JavaDemo$  obj and called using obj
7.here we call static method that method logic executed
       note: static method we don't required obj so directly we can call(but within class if
             we want call outside then compulsory we need that class name and method name
              ex: if you want to access this static method outside then compulsory we write following line
                   JavaDemo$.m1() access any where

8. then here executed last sout statement.

----OUTPUT-----------

This is static block
This is first program main start
This is non static block
This is constructor
This is m2
This is m1
This is first program main end


 */