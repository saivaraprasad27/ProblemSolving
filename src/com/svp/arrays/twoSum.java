package com.svp.arrays;
import java.util.HashMap;
import java.util.Arrays;

public class twoSum {
    public static int[] toSum(int [] nums,int n,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int value = nums[i];
            int findValue = target - value;
            if (map.containsKey(findValue)){
                return new int [] {map.get(findValue),i};
            }
            map.put(value,i);
        }
        return new int [] {-1,-1};
    }
    public static void main(String[] args){
        int [] arr ={3,2,4};
        int n= arr.length;
        int target = 6;
        System.out.println(Arrays.toString(toSum(arr, n, target)));
    }
}
