package com.codingninja.practise.leetcode.solutions.strings;

import java.util.HashMap;
import java.util.Map;

class FindLeastSumIndex {
    public String[] findRestaurant(String[] list1, String[] list2) {
        String[] abcder = new String[list1.length];
        Map<String, Integer> myMap = new HashMap<>();
        int sum = 0, another=0;
        for (int i = 0; i <list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    myMap.put(list1[i], i+j);
                }

            }
        }

        return null;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(!t.contains(s.charAt(i)+"")){
                return false;
            }
        }

        return true;
    }
}