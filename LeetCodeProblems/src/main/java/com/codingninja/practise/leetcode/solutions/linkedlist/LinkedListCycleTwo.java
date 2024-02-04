package com.codingninja.practise.leetcode.solutions.linkedlist;

class LinkedListCycleTwo {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode detectCycle(ListNode head) {
         if(head == null){
             return null;
         }

         ListNode sl = head;
         ListNode fa = head;
         int length = 0;
         while(fa != null && fa.next!=null){
             sl = sl.next;
             fa = fa.next.next;

             if(fa==sl){
                 ListNode temp = sl;
                 do{
                     sl = sl.next;
                     length++;
                 }while (sl!=temp);

                 break;
             }
         }
        ListNode s = head;
        ListNode f = head;
         while(length>0){
             s = s.next;
             length--;
         }

         while(f!=s){
             f=f.next;
             s=s.next;
         }

         return s;
    }

}