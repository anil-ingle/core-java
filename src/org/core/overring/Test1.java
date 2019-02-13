package org.core.overring;

class Parent {
    public void house(){
        System.out.println("Banglow");
    }
    public Demo marry(){
        System.out.println("Sangita");
        return  null;
    }
}

class Child extends Parent{
    public Test marry() {  // co-varient return type
        System.out.println("Diksha");
        return  null;
    }
}
public class Test1 {
    public static void main(String[] args) {
//        Parent p=new Parent();
//        p.marry();

//        Child c=new Child();
//        c.marry();
        // compiler
        Parent p=new Child();  // jvm
        p.marry();  // execute
    }
}

/*
What ever method parent has


 */


class Demo{}
class Test extends Demo{}