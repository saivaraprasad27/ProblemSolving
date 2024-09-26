package com.svp.arrays;

//optimized solution
//Second Largest
public class secondLargestNumberInArray {
    public static int secondLargestNumberInArray(int [] arr ,int n){
        int sec_num = Integer.MIN_VALUE;
        int first_num = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i] > first_num){
                sec_num = first_num;
                first_num = arr[i];
            }
            else if (arr[i]>sec_num && arr[i]< first_num){
                sec_num = arr[i];
            }
        }
        return sec_num;
    }
    public static void main(String[] args){
        int [] arr ={-1,-2,-3,0,1,2,3};
        int n = arr.length;
        System.out.println(secondLargestNumberInArray(arr,n));
    }
}
