package com.svp.arrays;
import java.util.Arrays;

public class sortColors {
    public static int[] sortColors(int[] nums, int n) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) cnt0++;
            else if (nums[i] == 1) cnt1++;
            else cnt2++;
        }

        for (int i = 0; i < cnt0; i++) nums[i] = 0;
        for (int i = cnt0; i < cnt0 + cnt1; i++) nums[i] = 1;
        for (int i = cnt0 + cnt1; i < n; i++) nums[i] = 2; // Changed 1 to 2 here

        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int n = arr.length;
        int[] sortedArr = sortColors(arr, n);
        System.out.println(Arrays.toString(sortedArr));
    }
}
