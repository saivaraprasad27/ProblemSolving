package com.svp.arrays;

import java.util.HashSet;

//extreme Brute
//might be chance time limit exceed
public class ContainsDuplicate {
    static boolean containsDuplicate(int[] arr, int n){
        for(int i = 0; i <n; i++){
            for (int j = 1; j <n; j++){
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        int n = arr.length;
        System.out.println(containsDuplicate(arr,n));
    }
}


//better solution
class betterSolution{
    static boolean containsDuplicate(int[] nums, int n){
        for(int i = 1; i <n; i++){
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        int n = arr.length;
        System.out.println(containsDuplicate(arr,n));
    }
}


//optimized Approach
class optimizedSolution{
    static boolean containsDuplicate(int[] arr,int n){
        HashSet<Integer> sawElement = new HashSet<>();
        for (int num : arr){
            if (sawElement.contains(num)) return true;
            sawElement.add(num);
        }
        return false;
    }
    public static void main(String[] args){
//        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        int [] arr = {1,2,3,4};
        int n = arr.length;
        System.out.println(containsDuplicate(arr,n));
    }
}