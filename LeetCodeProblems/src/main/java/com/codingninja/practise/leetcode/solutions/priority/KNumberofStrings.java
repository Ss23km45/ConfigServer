package com.codingninja.practise.leetcode.solutions.priority;

import java.util.*;

class KNumberofStrings {

    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
    }
    private static List<String> topKFrequent(String[] nums, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        PriorityQueue<Map.Entry<String,Integer>> myQueue = new PriorityQueue<>((a, b) -> {
            if((b.getValue() - a.getValue()) == 0)
                return b.getKey().compareTo(a.getKey());
            return a.getValue() - b.getValue();
        });
        for(Map.Entry<String, Integer> val : map.entrySet()){
            myQueue.offer(val);
            if(myQueue.size()>k){
                myQueue.poll();
            }
        }

        List<String> myList = new ArrayList<String>();
        for (int i = 0; i < k; i++) {
            myList.add(0,myQueue.poll().getKey());
        }

        return myList;
    }
}