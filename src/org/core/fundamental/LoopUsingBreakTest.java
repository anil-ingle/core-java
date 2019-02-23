package org.core.fundamental;

public class LoopUsingBreakTest {
    public static void main(String[] args) {
        int count=0;
      label:  for (int i = 0; i < 100; i++) {
            count++;
            if (i == 37) {
                break label;
            }
        }
        System.out.println(count);
    }
}
// break used only places 1 switch 2 loop 3. label