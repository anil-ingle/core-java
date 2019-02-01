package org.core.array;

public  class SelectionSortArrayTest {
    public static void main(String[] args) {
        int[] arr={20,55,78,44,50,5,96,4};// int[] arr=new int[7];
        // 96 20 55 44 5 78 4
        // 4 5 20 44 55 78 96
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++) {
                // i=0  arr[0]===>20
                if(arr[i]>arr[j]){  // j=1  arr[i]===>55
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k] +" ");
            }
            System.out.println();
        }
//        for(int j=0;j<arr.length;j++) {
//            System.out.print(arr[j]+" ");
//        }
    }

}
