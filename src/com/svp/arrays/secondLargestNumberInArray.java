package com.svp.arrays;

import java.util.Arrays;

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

//optimized
//second smallest number
class secondSmallestNumber{
    static int secondSmallestNum(int[] arr,int n){
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int i=0;i < n; i++){
            if (arr[i] < small){
                secondSmall = small;
                small = arr[i];
            }
            else if (arr[i] < secondSmall && arr[i]!=small){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
    public static void main(String[] args){
        int [] arr ={-1,-2,-3,0,1,2,3};
        int n = arr.length;
        System.out.println(secondSmallestNum(arr,n));
    }
}

//Extreme brute
//small and large element
class secondLarNumber{
    static int [] bruteSecondLargestNumber(int [] arr, int n){
        Arrays.sort(arr);
        int large = arr[n-2];
        int small = arr[1];
        return new int[] {small,large};
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println(Arrays.toString(bruteSecondLargestNumber(arr,n)));
    }
}