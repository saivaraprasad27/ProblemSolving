package com.svp.arrays;
import java.util.HashMap;
import java.util.Map;

//bruteSolution
public class MajorityElementGreaterThanNbyTwo {
    public static int bruteSolution(int[] arr,int len){
        for(int i=0; i < len; i++){
            int count = 0;
            for(int j = 0; j < len; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count >= len/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {3,2,3};
        //{6,5,5};code failed for this testcase
        int len = nums.length;
        System.out.println(bruteSolution(nums,len));
    }
}

//betterSolution
class checkMajorityElementGreaterThanNbyTwo{
    public static int betterSolution(int [] arr,int len){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr ) map.put(num , map.getOrDefault(num,0)+1);
        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            if (it.getValue() > len/2){
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {6,5,5};
        int len = nums.length;
        System.out.println(betterSolution(nums,len));
    }
}
