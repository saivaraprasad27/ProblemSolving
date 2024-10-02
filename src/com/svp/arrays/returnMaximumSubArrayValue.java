package com.svp.arrays;

public class returnMaximumSubArrayValue {
    public static int kadanesAlgorithm(int []arr,int n){
        if (n == 1) return arr[0];
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i < n; i++){
            sum += arr[i];
            if (sum > maxi) maxi = sum;
            if (sum < 0) sum = 0;
        }
        return maxi;
    }
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        System.out.println(kadanesAlgorithm(arr,n));
    }
}
