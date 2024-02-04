package com.codingninja.practise.leetcode.solutions;

import java.util.Arrays;

class RemoveElemets {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2,4,2,6,4,2,3,7,8,3,6,4,4,4,4};
        System.out.println(removeElement(nums,4));
/*
        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).*/
    }
    private static int removeElement(int[] nums, int val) {
        int k=0, index=0;
        int last = nums.length-1;

        while(index< nums.length){
            if(nums[index] == val){
                nums[index] = -1;
                int temp = nums[last];
                nums[last] = nums[index];
                nums[index] = temp;
                last -= 1;
                k++;
            }

            if(nums[index] == val){
                index +=0;
            }else{
                index +=1;
            }
       }
        return nums.length - k;
    }
}