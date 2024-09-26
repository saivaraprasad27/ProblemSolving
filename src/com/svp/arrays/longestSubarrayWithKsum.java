package com.svp.arrays;

import java.util.ArrayList;

//bruteApproach1
//O(n^3)
public class longestSubarrayWithKsum {
    static int longestSubarraywithKSum(int[] arr,int n,int target){
        int len =0;
        for (int i=0; i < n; i++){
            for (int j = i; j < n; j++){
                long sum = 0;
                for (int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if (sum == target){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        int [] arr =  {10, 5, 2, 7, 1, 9};
        int target = 15;
        int n = arr.length;
        System.out.println(longestSubarraywithKSum(arr,n,target));
    }
}

//bruteApproach2
//O(n^2)
class Solution2{
    static int longestSubarraywithKSum(int[]arr,int n,int target){
        int len = 0;
        for (int i=0; i<n; i++){
            int sum = 0;
            for (int j=i; j<n ;j++){
                sum += arr[j];
                if (sum == target){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        int [] arr =  {10, 5, 2, 7, 1, 9};
        int target = 15;
        int n = arr.length;
        System.out.println(longestSubarraywithKSum(arr,n,target));
    }
}
