package org.core.overloading;

public class OverloadingObjectTypeTest {

    public void m1(Object obj){
        System.out.println(" obj org");
    }
    public void m1(String s){
        System.out.println("string -arg");
    }

    public static void main(String[] args) {
        OverloadingObjectTypeTest test=new OverloadingObjectTypeTest();
         test.m1("jay");
         Object obj=new Object();
         test.m1(obj);
         Integer i=new Integer("10");
         test.m1(i);

    }
}
