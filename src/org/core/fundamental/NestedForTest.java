package org.core.fundamental;

public class NestedForTest {
    public static void main(String[] args) {

        for(int i=1;i<=3;i++){

            for(int j=1;j<=3;j++){

                System.out.print(i+" ");
            }
            System.out.println(); // line change
        }

        // System.out.println("end ");
    }

}
