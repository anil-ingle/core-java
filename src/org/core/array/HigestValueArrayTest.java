package org.core.array;

public class HigestValueArrayTest {
    public static void main(String[] args) {
        int[] arr={20,55,78,44,5,96,4};// int[] arr=new int[7];
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                continue;
            }
            else if(arr[i]>temp){
               temp=arr[i];
            }
        }
        System.out.println("highet value "+temp);

    }
}
