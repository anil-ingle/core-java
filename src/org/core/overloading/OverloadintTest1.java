package org.core.overloading;

public class OverloadintTest1 {

    public void add(int x, int y) {
        System.out.println("add with 2 arg  " + (x + y));
    }

    public void add(int x, int y, int z) {
        System.out.println("add with 3 arg  " + (x + y + z));
    }


    public void add(int... i) { // least priority
        System.out.println("var arg");
    }

    public static void main(String[] args) {
        OverloadintTest1 test = new OverloadintTest1();
       // test.add(20, 30); // calling
         test.add(10,20,30,40); // calling
        //test.add();
    }
}
