package org.core.constructor;

public class Example {

    public Example(){
       this(10);// calling
        System.out.println("0-arg constructor");
    }

    public Example(int x){
        System.out.println("1-arg constructor");
    }

    public Example(int x,String name){
        this();// call o-arg
        System.out.println("2-arg constructor");
    }

    public static void main(String[] args) {
       // Example e=new Example();
        Example e=new Example(10,"abc");

    }
}
