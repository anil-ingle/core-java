package org.core.test;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade....");
        String grade = sc.next();
        switch (grade) { // var/exp
            case "A":
                System.out.println("grade A");
                break;
            case "B":
                System.out.println("grade B");

                break;
            default:
                System.out.println("fail");
        }
    }
}

/*

Assignment:
     take dynamic value of three sub ject using scanner and find average then check avg.
      if grater than or equal to 60  print first class.
      if avg. grater than or eqaul to 45 and less than 60 then print second class
     if avg greater than or equal to 35 and less than 45 then print only pass
     if avg less than 35 then print fail
     note:ignore each sub must having 35 mark.
 */
