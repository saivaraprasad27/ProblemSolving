package com.svp.arrays;

import java.util.Arrays;

//this code is failed for negative array,let we solve that also
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

//the code validate complete -ve,+ve array
//getting proper output
//optimized solution
class CheckKadanesAlgorithm{
    public static int testCheckKadanesAlgorithm(int [] arr, int len) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < len; i++){
            sum += arr[i];
            if ( maxi < sum ){
                maxi = sum;
            }
            if ( sum < 0 ){
                sum = 0;
                count+=1;
            }
        }
        if (count == len){
            int updatedmaxi = findMax(arr);
            return updatedmaxi;
        }
        return maxi;

    }
    public static void main(String[] args){
        int[] arr = { -2, -1,-3,-4,-1};
        int len = arr.length;
        System.out.println(testCheckKadanesAlgorithm(arr,len));
    }
    public static int findMax(int [] nums){
        return Arrays.stream(nums).max().orElseThrow();
    }

}
