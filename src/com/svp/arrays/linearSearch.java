package com.svp.arrays;

public class linearSearch {
    //Extreme Brute
    public static int findElementUsingLinearSearch(int[] arr,int target) {
        for(int i=0; i < arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,6};
        int target = 6;
        System.out.println(findElementUsingLinearSearch(arr,target));
    }
}

//Optimized
class OptimizedApproachLinearSearch {
    public static boolean findTargetInteger(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        System.out.println(findTargetInteger(arr, target));
    }
}

