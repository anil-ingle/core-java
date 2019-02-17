package org.core.constructor;

class Sample {
    String name = "Ramesh";
    int id = 102;

}

public class Employee extends Sample {
    String name;
    int id;

    Employee(String name, int id) {

        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        Employee e = new Employee("Raja", 101);
        e.m1();

    }

    void m1() {
        String name = "Rani";
        System.out.println("id--class leve  " + this.id);
        System.out.println("name--class level  " + this.name);
        System.out.println("name--local " + name);
        System.out.println("name-- super class  " + super.name);
        System.out.println("id-- super class   " + super.id);
    }
}
