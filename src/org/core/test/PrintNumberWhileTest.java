package org.core.test;

        public class PrintNumberWhileTest {
//            public static void  main(String[] args){
//                int
//            }
public static void main(String[] args) {
    int number =0;
    while(number<10){
        number=number+1;
        if(number>=7) continue; // when continue executed then ignore following lines and control goes to while loop
        System.out.println("number  "+number);

    }
}
}
