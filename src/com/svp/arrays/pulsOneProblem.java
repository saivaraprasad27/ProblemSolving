package com.svp.arrays;

import java.util.Arrays;

//optimalSolution
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

class pulsOne{
    static int[] plusOneBruteSolution(int [] arr){
        reverseArray(arr);
        int n = arr.length;
        for(int i =0;i < n; i++){
            arr[i]+=1;
            if (arr[i] < 10){
                reverseArray(arr);
                return arr;
            }
            else {
                arr[i] = 0;
            }
        }
        int [] newArr = new int [arr.length+1];
        newArr[0] = 1;
        return newArr;
    }
    //reverseArray
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int arr [] = {1,2,3,4};
        System.out.println(Arrays.toString(plusOneBruteSolution(arr)));
    }
}