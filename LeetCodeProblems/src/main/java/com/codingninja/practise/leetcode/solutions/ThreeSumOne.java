package com.codingninja.practise.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumOne {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        Arrays.sort(nums);

        //Duplicate are getting added to List so incorrect solution
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        myList.add(Arrays.asList( nums[i] , nums[j] , nums[k]));
                    }
                }
            }
        }



        return myList;
    }
}