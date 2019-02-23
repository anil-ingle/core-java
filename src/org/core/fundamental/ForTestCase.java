package org.core.fundamental;

public class ForTestCase {
    public static void main(String[] args) {
//        for(int i=0;;i++)  // always condt: true
//            System.out.println("jay");

//        for(int i=0, j=0,k=0,h=0 ;i<10;i++){  // intilization you can take any
//            System.out.println("jay ");
//        }

//        int i=0;
//        for(System.out.println("jay"); i<2; System.out.println(" abc")){
//            System.out.println("adi");
//            i++;
//        }
        final int x=1,y=2;
       // x=5; //reassignment not possible
//        for(;x>y;){
//            System.out.println(" jay");
//        }
//        System.out.println(" anil");

        label: for(int i=0;i<20;i++) {
            if (i == 7) {
                break label;
            }
        }
//        int y=1;
        l:
        if(y==1){
            break l;
        }
        System.out.println("end of l");
    }
}
