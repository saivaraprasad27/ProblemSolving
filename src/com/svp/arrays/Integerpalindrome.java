package com.svp.arrays;


public class Integerpalindrome {
    public static boolean negativeIntegerPal(int n){
        int x;
        if (n < 0) x = -1* n;
        else  x = 1*n;
        int reverse = 0;
        int temp = x;
        while (temp > 0){
            reverse = reverse * 10 + n % 10;
            temp = temp / 10;
        }
        if (reverse == x) return true;
        return false;
    }
    public static void main(String[] args){
        int n = -121;
        System.out.println(negativeIntegerPal(n));
    }
}
