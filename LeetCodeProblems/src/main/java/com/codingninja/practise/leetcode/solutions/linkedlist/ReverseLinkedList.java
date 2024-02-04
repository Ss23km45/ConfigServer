package com.codingninja.practise.leetcode.solutions.linkedlist;

class ReverseLinkedList {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode reverseList(ListNode head) {

        if(head==null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode future = head.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = future;
            if(future != null){
                future = future.next;
            }
        }

        return prev;
    }

}