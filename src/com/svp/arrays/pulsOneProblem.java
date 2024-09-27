package com.svp.arrays;

import java.util.Arrays;

public class pulsOneProblem {
    static int[] plusOneSol(int[] arr){
        int n = arr.length;
        for(int i = arr.length-1; i>=0 ;i--){
            if(arr[i]+1!=10){
                arr[i] +=1;
                return arr;
            }
            arr[i] = 0;
        }
        int [] newDigits = new int[arr.length+1];
        newDigits[0] =1;
        return newDigits;
    }
    public static void main(String[] args){
        int [] arr = {9};
        //int arr [] = {1,2,3,4};
        System.out.println(Arrays.toString(plusOneSol(arr)));
    }
}
