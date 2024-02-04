package com.codingninja.practise.leetcode.solutions.priority;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> myP = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> myP1 = new PriorityQueue<>();
Boolean flag =  true;

        if(flag){
            myP.offer(1);
            myP1.offer(myP.poll());
        }
        myP.offer(1);
        myP.offer(8);
        myP.offer(6);
        myP.offer(7);
        myP.offer(2);
        myP.offer(3);

        System.out.println(myP.poll());


    }
}
