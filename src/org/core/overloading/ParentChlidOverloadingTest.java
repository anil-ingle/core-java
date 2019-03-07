package org.core.overloading;

class Parent{
    void add(int a,int b){
        System.out.println("parent add with two int args");
    }
}
class Child extends  Parent{
    void add(float a, float b){
        System.out.println("Child add with two float args");
    }
}
public  class ParentChlidOverloadingTest{
    public static void main(String[] args) {
        Parent p=new Child();
        p.add(10,20);// parent class method executed
        p.add(10.00,20.00);// CE
        Child c=new Child();
        c.add(10,20);// Parent class add
        c.add(10.00,20.00); // Child class add method ie Overloaded method.

    }
}