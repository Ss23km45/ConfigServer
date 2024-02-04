package com.codingninja.practise.leetcode.solutions.linkedlist;

class ReOrderLinkedList {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public void reorderList(ListNode head) {
        ListNode mid = head;
        ListNode fast = head;
        //1->2->3->4-> hs
        //5->6->7  hm

        while (fast != null & fast.next!=null){
            mid = mid.next;
            fast = fast.next.next;
        }

        ListNode hm = reverseList(mid.next);
        ListNode hs = head;

        while(hs!=null && hm!=null){
            ListNode temp = hs.next;
            hs.next = hm;
            hs = hs.next;

            temp = hm.next;
            hm.next = hs;
            hm = temp;
        }

    }

    private ListNode reverseList(ListNode head){
         if(head == null){
             return head;
         }
         ListNode prev=null;
         ListNode present = head;
         ListNode future = present.next;

         while(present != null){
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