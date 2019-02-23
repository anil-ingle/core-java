package org.core.fundamental;

public class ArmstrongTest {
    public static void main(String[] args) {
        int number =153;
        int copyNumber=number;
        int result=0 ,rem=0;

        while(number>0){
            rem=number%10;
            result=result+(rem*rem*rem);
            number=number/10; // same var changes
        }
        if(result==copyNumber ){
            System.out.println("armstrong reslut  "+result+"   number  "+number +" copyNumber "+copyNumber);
        }else{
            System.out.println(" not armstrong reslut  "+result+"  number  "+number +" copyNumber "+copyNumber);
        }
    }
}
// 156==> 1+5*5*5+6*6*6=1+125+x=