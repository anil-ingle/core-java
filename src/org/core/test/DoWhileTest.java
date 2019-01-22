package org.core.test;

public class DoWhileTest {
    public static void main(String[] args) {
        int i = 1;
        do {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}
