package org.core.test;

public class LogicalAndLogicalOrTest {
    public static void main(String[] args) {
        int x=10, y=30 ,c=0 ,z=20;
        if(x == y && z==20 ){
                x++;y++;
        }else{
            --x;--y;
        }
        System.out.println(x+"  "+y);
    }
}
