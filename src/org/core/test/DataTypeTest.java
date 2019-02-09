package org.core.test;

public class DataTypeTest {
    int number;
    double d = 10.2;
    float f = 4.0f;
    long l=20;
    short s=40;
    short s1=220;    
    byte b=-128;   // -128 to +127
    char c='a';
    char c1=98;
    String name="Jay";// correct
    String name1=new String("Jay"); 


    // static int second=40;
//   {
//       number=0;
//       d=10.2;
//       f=4.2f;
//   }

    int third=7;
    // m1 method
    void m1(){
        System.out.println(third);

    }

    public static void main(String[] args) {
        DataTypeTest test = new DataTypeTest();
        System.out.println("test " + test.number + "   d   " + test.d + "  f  " + test.f);
        System.out.println(test.third);
        test.m1();
    }


}
