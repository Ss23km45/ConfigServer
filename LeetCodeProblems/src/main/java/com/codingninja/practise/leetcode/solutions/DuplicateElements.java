package com.codingninja.practise.leetcode.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class DuplicateElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,6,6,7,8};
        if(containsDuplicate(nums)){
            System.out.println("This is Duplicated Array");
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i <= nums.length  - 1; i++) {
            if(map.contains(nums[i])){
                return true;
            }

            map.add(nums[i]);
        }
        return false;
/*        int[] mylist = Arrays.stream(nums).distinct().toArray();

        if(nums.length != mylist.length) {
            return true;
        }
        else {
            return false;
        }*/
    }
}