package org.core.fundamental;

public class ReverseInputNumberTest {
    public static void main(String[] args) {
        int input = 135;
        int reverse = 0, rem = 0;

        while (input > 0) {
          rem=input%10;

          reverse=reverse*10 +rem ; // change

          input=input/10;
        }
        System.out.println("reverse -->" + reverse);
    }

}