package com.codingninja.practise.leetcode.solutions;

import java.util.Arrays;

class LongestCommonPrefixString {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;

        while(index < first.length() && index < last.length()){
            if(first.charAt(index) == last.charAt(index)){
                index++;
                continue;
            }else{
                break;
            }


        }

        return first.substring(0, index);
    }
}