package org.core.overloading;

public class OverloadintTest1 {

    public void add(int x, int y) { // int x, int y-> parameter
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
         // fundamental.add(20, 30); // calling  // argument
         ///fundamental.add(10,20,30); // calling
            //fundamental.add();// no argu

    }
}
