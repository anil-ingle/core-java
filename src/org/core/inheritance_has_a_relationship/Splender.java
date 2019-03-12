package org.core.inheritance_has_a_relationship;

class Engine {

    public void showCC() {
        System.out.println(" 100 cc");
    }
}

public class Splender {
    public static void main(String[] args) {
        Engine e = new Engine();
        e.showCC();
        Sheet1 s1 = new Sheet1();
        s1.getSheet();
    }
}
/*
   1. also know as composition/ agregation
   2.main advantage re-usability.
   3.by using new keyword.

 */