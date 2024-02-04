package com.codingninja.practise.leetcode.solutions.pack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {4,6,3,8,7,11,13,15,10};
//        findMissingNumbers(a);
        int[] arr = {10,20,30,40,60,-10,70};
        checkSum(arr,60);
    }

    private static void checkSum(int[] a, int sum){
        Map<Integer, Integer> myMap = new HashMap<>();
        // 10:40 ;; 20:30 :: 30:20 :: 60:-10

        for (int i = 0; i < a.length; i++) {
            int locl = sum - a[i]; // 40;
            if(!myMap.containsKey(locl)){
                myMap.put(a[i],locl);
            }else {
                System.out.println(locl + " " + myMap.get(locl));
            }


        }

    }

    private static void findMissingNumbers(int[] a) {
        int small = a[0], small1 = a[0];
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            myList.add(a[i]);
            if(small < a[i]){
                small = a[i];
            }
            if(small1 > a[i]){
                small = a[i];
            }
        }

        for (int i = small1; i < small; i++) {
            if(!myList.contains(i)){
                System.out.print(i + " - ");
            }

        }

    }
}
