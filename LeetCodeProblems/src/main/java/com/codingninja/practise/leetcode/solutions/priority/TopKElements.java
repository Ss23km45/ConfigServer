package com.codingninja.practise.leetcode.solutions.priority;

import java.util.*;

class TopKElements {
    public static void main(String[] args) {
        topKFrequent(new int[]{4,1,-1,2,-1,2,3},2);
    }
    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> myQueue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());
        for(Map.Entry<Integer, Integer> val : map.entrySet()){
            myQueue.offer(val);
            if(myQueue.size()>k){
                myQueue.poll();
            }
        }

        int[] kk = new int[k];
        for (int i = 0; i < k; i++) {
            kk[i] = myQueue.poll().getKey();
        }

        return kk;
    }
}