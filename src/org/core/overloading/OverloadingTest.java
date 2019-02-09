package org.core.overloading;

public class OverloadingTest {
    public  void m1(int x, float y){
        System.out.println("int -float -arg");
    }

    public  void m1(float x, int y){
        System.out.println("float -int -arg");
    }

    public static void main(String[] args) {
        OverloadingTest test=new OverloadingTest();
          test.m1(20,30.00f);
          test.m1(20.00f,20);
          test.m1(20.00f,20);
        //  test.m1(20,20.00);//CE

    }
}
