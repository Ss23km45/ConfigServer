package com.codingninja.practise.leetcode.solutions.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LinkedListCycle {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public boolean hasCycle(ListNode head) {
         if(head.next == null){
             return false;
         }

         ListNode slow = head;
         ListNode fast = head;
         while(fast != null && fast.next !=null){
                 slow = slow.next;
                 fast = fast.next.next;

             if(slow == fast){return true;}

         }

         return false;
    }

}