package com.careerdevs;

public class StringAddition {
    public static int addNums(String nums) {
        String[] arr = nums.split(", ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
} 