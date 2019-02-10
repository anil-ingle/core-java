package org.core.test;

public class DataTypeTest {
    int number; // default value is 0
    double d = 10.2;// default value is 0.0
    float f = 4.0f;// default value is 0.0
    long l = 20;
    short s = 40;
    short s1 = 220;
    byte b = -128;   // -128 to +127
    char c = 'a';
    char c1 = 98;
    String name = "Jay";// String literal
    String name1 = "Jay";


    // static int second=40;
//   {
//       number=0;
//       d=10.2;
//       f=4.2f;
//   }

    int third = 7;

    public static void main(String[] args) {
        DataTypeTest test = new DataTypeTest();
        System.out.println("test " + test.number + "   d   " + test.d + "  f  " + test.f);
        System.out.println(test.third);
        test.m1();
    }

    // m1 method
    void m1() {
        System.out.println(third);
    }


}
