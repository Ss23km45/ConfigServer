package com.codingninja.practise.leetcode.solutions.priority;

import java.time.Instant;
import java.util.*;

class SingleNumberSolution {
    public static void main(String[] args) {
        Instant time = Instant.now();
        System.out.println(time);
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,99}));
        System.out.println();
    }
    private static int singleNumber(int[] nums) {

        PriorityQueue<Map.Entry<Integer,Integer>> myQueue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for (Map.Entry<Integer,Integer> val : map.entrySet()){
            myQueue.offer(val);
        }

        return myQueue.poll().getKey();
    }
}