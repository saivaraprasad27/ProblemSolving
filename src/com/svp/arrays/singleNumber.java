package com.svp.arrays;

public class singleNumber {
    public static int findSingleNumber(int [] arr){
        //XOR same values return 0
        //ECE Approach
        int single_num = 0;
        for(int num:arr){
            single_num ^= num;
        }
        return single_num;
    }
    public static void main(String[] args){
        int arr [] ={1,2,3,3,1};
        System.out.println(findSingleNumber(arr));
    }
}

//Extreme Brute Approach
class bruteApproach {
    public static int findSingleNumberBruteApproach(int[] arr, int n)
    {
        int max = -1;
        for (int num:arr){
            max =Math.max(max,num);
        }
        int [] hash = new int[max+1];
        for(int i=0 ;i<n; i++){
            hash[arr[i]]++;
        }
        for(int i=0 ;i<n; i++){
            if (hash[arr[i]] ==1)
                return arr[i];
        }
        return -1; //If no single found
    }
    public static void main(String[] args){
        int arr [] ={1,2,3,3,1};
        int n = arr.length;
        System.out.println(findSingleNumberBruteApproach(arr,n));
    }
}

