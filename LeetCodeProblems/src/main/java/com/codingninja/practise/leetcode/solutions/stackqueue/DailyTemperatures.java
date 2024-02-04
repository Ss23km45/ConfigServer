package com.codingninja.practise.leetcode.solutions.stackqueue;

import java.util.Arrays;
import java.util.Stack;

class DailyTemperatures {

    /*Input: temperatures = [73,74,75,71,69,72,76,73]
    Output: [1,1,4,2,1,1,0,0]*/

    public static void main(String[] args) {
        /*int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(temperatures);*/

//        System.out.println(Arrays.toString(ans));
        System.out.println(Math.divideExact(3,2));
    }
    private static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stck = new Stack<>();
        int[] myarr = new int[temperatures.length];

        for (int i = 1; i < temperatures.length; i++) {
            stck.push(temperatures[i-1]);
            if(temperatures[i-1] < temperatures[i]){
                myarr[i-1] = 0;
            } else if (temperatures[i-1] > temperatures[i]) {
                int count =0;
                for (int j = i; j < temperatures.length; j++) {
                    count +=1;
                    if(temperatures[i-1] < temperatures[j]){
                        break;
                    }
                }
                myarr[i-1] = count;
            }
        }

        return myarr;
    }
}