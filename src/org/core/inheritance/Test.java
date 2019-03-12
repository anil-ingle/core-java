package org.core.inheritance;

class Parent {
    public void m1() {
        System.out.println("m1 method");
    }
}

class Parent1 {
}

class Child extends Parent {
    public void m2() {
        System.out.println("m2() method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        //  p.m2(); // CE   can not find symbo m2 location Parent
        Child c = new Child();
        c.m1();
        c.m2();

        Parent p1 = new Child();
        p1.m1();
        // p1.m2();// CE  can not find symbo m2 location Parent

        // Child c2=new Parent(); WE can't store reference child using Parent
    }
}

/*

1.It is also known as Is-a Relationship
2. The main Advantage of is-a relationship is code re-usability
3.By using extends keyword we can implements is-a relationship
4.Java class can't extends more than one class at a time hence java won't
    provide multiple inheritance support
    EX. class C extends B, C // CE :Class cannot extend multiple classes
5. The most common method which are applicable for any type of child we
    have defined (write) in parent class.
6. The specific (child required) method we have to defined(write) in
   child class.

 */