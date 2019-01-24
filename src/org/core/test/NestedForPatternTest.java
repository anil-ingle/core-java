package org.core.test;

public class NestedForPatternTest {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){ // for -column
            for(int j=1;j<=i ;j++){ // for - row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
1
1 2
1 2 3
 */

/*
*
* *
*  * *
 */