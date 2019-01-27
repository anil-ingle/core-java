package org.core.test;

public class PostIncPreIncOperatorTest {
    public static void main(String[] args) {
      //  int a=10;
//        int b=++a;// a++==> a=a+a
//        System.out.println(a+"   "+b);  output 11   11
//        int b=--a;
//        System.out.println(a+"   "+b);
//
//        int x=10;
//        int y=x++;  //y=10, x=x+1
//        System.out.println(x+"   "+y);
//        int p=10;
//        int q=p--;// p=9 q=10
//        System.out.println(p+"   "+q);

        int a=10,b=20,c=30;
       // int x=--a+ b++ ;
        //System.out.println("x "+x+" a "+a +" b "+b);
        byte num=10;
        num=(byte)(num+1); // short+int=int
        num++;// internally type cast
        //<-- 29
        // --> 31
//        int y=++a + --a+a++;
//        System.out.println("x "+y +" a "+a);
        final int z=10;
       // z++; const/final --> we cant do post and pre operation.
         float f=10.0f;
        f++;
       // System.out.println(f);
        boolean booleanValue=true;
       // booleanValue++;  except boolean we can perform inc dec any primitive
        char ch='b';
        ch++;
        System.out.println(ch);



    }
}
