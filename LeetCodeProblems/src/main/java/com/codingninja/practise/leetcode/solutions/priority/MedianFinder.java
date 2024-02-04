package com.codingninja.practise.leetcode.solutions.priority;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {

    private PriorityQueue<Integer> smallHeap;
    private PriorityQueue<Integer> largeHeap;
    private boolean even = true;

    public MedianFinder() {
        smallHeap = new PriorityQueue<>(Comparator.reverseOrder());
        largeHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(even){
            largeHeap.offer(num);
            smallHeap.offer(largeHeap.poll());
        }else{
            smallHeap.offer(num);
            largeHeap.offer(smallHeap.poll());
        }

        even = !even;
    }
    
    public double findMedian() {
        if(even){
            return (double) (smallHeap.peek() + largeHeap.peek()) / 2.0;
        }else{
            return smallHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */