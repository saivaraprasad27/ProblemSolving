package com.svp.arrays;

public class findMaxConsecutiveOnes {
    public static int MaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int cnt =0;
        int max=0;
        for (int i=0;i<n;i++){
            if (nums[i]==1){
                cnt++;
                max =Math.max(cnt,max);
            }
            else{
                cnt =0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int [] nums ={1,0,1,1,0,1,1,1,1};
        System.out.println(MaxConsecutiveOnes(nums));
    }
}
