package com.codingninja.practise.leetcode.solutions;

import java.util.*;
import java.util.Collections;

public class CountEachWord {
    public static void main(String[] args) {
        countEachWord("This project is the best project in the company");
    }

    private static void countEachWord(String s) {
        List<String> list = Arrays.stream(s.split(" ")).toList();
        Map<String, Integer> myMap = new HashMap<>();
        for(String str: list){
            /*if(myMap.containsKey(str)){
                continue;
            }else{
                myMap.put(str, Collections.frequency(list, str));
            }*/

            myMap.put(str, Collections.frequency(list, str));
        }

        System.out.println(myMap);
    }
}
