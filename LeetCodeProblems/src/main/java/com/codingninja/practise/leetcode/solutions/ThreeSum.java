package com.codingninja.practise.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> secList = new ArrayList<>();
        Arrays.sort(nums);

        // -2 -2 0 0 2 2

        for (int i = 0; i < nums.length; i++) {
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }else{
                int l = i +1;
                int r = nums.length - 1;
                while (l < r){
                    int sum = nums[i] + nums[l] + nums[r];
                    if(sum > 0){
                        r -= 1;
                    } else if (sum < 0) {
                        l +=1;
                    } else if (sum == 0) {
                        myList.add(Arrays.asList( nums[i] , nums[l] , nums[r]));
                        l += 1;
                        while ((nums[l] == nums[l-1]) && (l < r)){
                            l += 1;
                        }
                    }
                }
            }
        }


/*        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        myList.add(Arrays.asList( nums[i] , nums[j] , nums[k]));
                    }
                }
            }
        }*/



        return myList;
    }
}