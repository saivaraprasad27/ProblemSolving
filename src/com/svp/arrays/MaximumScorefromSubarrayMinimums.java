package com.svp.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumScorefromSubarrayMinimums {
    public static int pairWithMaxSum(List<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size()-1 ;i++){
            int sum = arr.get(i) + arr.get(i+1);
            max = Math.max(sum,max);
        }
        return max;
    }
    public static void main(String[] args){
        int [] nums = {5, 4, 3, 1, 6};
        List<Integer> arr = new ArrayList<>();
        for (int i =0; i < nums.length;i++) arr.add(nums[i]);
        System.out.println(new MaximumScorefromSubarrayMinimums().pairWithMaxSum(arr));
    }
}
