package com.codingninja.practise.leetcode.solutions.priority;

import java.util.Comparator;
import java.util.PriorityQueue;

class KthLargest {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{4,1,-1,2,-1,2,3},2));
    }
    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            myQueue.offer(nums[i]);
        }

        for (int i = 0; i < k-1; i++) {
            myQueue.poll();
        }

        return myQueue.peek();
    }
}