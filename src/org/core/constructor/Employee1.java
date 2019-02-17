package org.core.constructor;

class Sample1 {
    Sample1(){
        super();
    }
//    Sample1() {
//        this(10);// calling sample class one -arg constructor
//        System.out.println("Sample1 0-arg class constructor");
//    }
//
//    Sample1(int id) {
//        System.out.println("Sample1 1-arg class constructor");
//    }
}

public class Employee1 extends Sample1 {
    String name;
    int id;

     Employee1() {

        System.out.println("Employee o-arg constructor");
    }

    Employee1(String name, int id) {
        this();
        this.name = name;
        this.id = id;
        System.out.println("Employee1 class constructor");
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1("Raja", 101);
    }


}
/*
1. Name of class and name of constructor must be same.

2. return type concept not applicable for constructor.

3. Applicable modifier --> public, protected ,protected ,<default>

4.compiler generated default constructor  if and only if when programmer not write any constructor.

5 constructor 1st line required this() or super(), if u r not place any thing constructor automatically add super().

6. 1st line this() or super() but not both.

 */