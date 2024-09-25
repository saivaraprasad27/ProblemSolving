package com.svp.arrays;

import java.util.*;
import java.util.ArrayList;

//Extreme Brute
//works only positive arrays
public class findUnion {
       public static ArrayList<Integer> findUnionP(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int max = 0;
        for (int i = 0; i < n1; i++) max = Math.max(max, arr1[i]);
        for (int j = 0; j < n2; j++) max = Math.max(max, arr2[j]);

        int[] hash = new int[max + 1];
        for (int i = 0; i < n1; i++) hash[arr1[i]]++;
        for (int j = 0; j < n2; j++) hash[arr2[j]]++;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int []  arr1 = {2, 2, 3, 4, 5,5,6};
        int []  arr2 = {1, 1, 2, 3, 4};
        System.out.println((findUnionP(arr1,arr2)));
    }
}

//extreme brute
class findUnionOfTwoSortedArrays1 {
    static ArrayList<Integer> findUnion(int[] arr1, int [] arr2){
        int n = arr1.length;
        int m = arr2.length;
        HashMap<Integer,Integer> frequency = new HashMap();
        ArrayList<Integer> list = new ArrayList<>();
        //arr1 values store in hashmap
        for (int i=0;i<n;i++) {
            frequency.put(arr1[i], frequency.getOrDefault(arr1[i],0 )+1);
        }
        //arr1 values store in hashmap
        for (int i=0;i<m;i++){
            frequency.put(arr2[i],frequency.getOrDefault(arr2[i],0)+1);
        }

        for(int it :frequency.keySet()){
            list.add(it);
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args){
        int []  arr1 = {-7,8};
        int []  arr2 = {-8,-3,8};
        System.out.println((findUnion(arr1,arr2)));
    }
}

//hashset
class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        HashSet <Integer> s=new HashSet<>();
        ArrayList < Integer > list = new ArrayList<>();
        for (int i = 0; i < n; i++)  s.add(arr1[i]);
        for(int i = 0; i < m; i++)  s.add(arr2[i]);
        for (int it : s)  list.add(it);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args){
        int []  num1 = {-7,8};
        int [] num2 = {-8,-3,8};
        int n = num1.length;
        int m = num2.length;
        System.out.println(findUnion(num1, num2,n,m));
    }
}

//optimized solution
class UnionArrayOptimizedSolution{
    static ArrayList<Integer>  findUnionOfTwoSortedArrays(int[] arr1,int[] arr2,int n,int m)
    {
        int i=0, j=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> unionArray = new ArrayList<>();
        while (i<n && j<m){
            if (arr1[i]<=arr2[j]){
                if (unionArray.size()==0 || unionArray.get(unionArray.size()-1) != arr1[i])
                    unionArray.add(arr1[i]);
                i++;
            }
            else
            {
                if (unionArray.size()==0 || unionArray.get(unionArray.size()-1) != arr2[j])
                    unionArray.add(arr2[j]);
                j++;
            }
        }
        while (i < n){
            if (unionArray.get(unionArray.size()-1)!=arr1[i])
                unionArray.add(arr1[i]);
            i++;
        }
        while (j < m){
            if (unionArray.get(unionArray.size()-1)!=arr2[j])
                unionArray.add(arr2[i]);
            j++;
        }
        return unionArray;
    }
    public static void main(String[] args){
        int []  num1 = {-7,8};
        int [] num2 = {-8,-3,8};
        int n = num1.length;
        int m = num2.length;
        System.out.println(findUnionOfTwoSortedArrays(num1, num2,n,m));
    }
}
