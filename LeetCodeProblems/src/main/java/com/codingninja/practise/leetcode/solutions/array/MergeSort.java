package com.codingninja.practise.leetcode.solutions.array;


public class MergeSort {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
            ListNode a = new ListNode(35);
            ListNode b = new ListNode(45,a);
        ListNode c = new ListNode(135,b);
        ListNode d = new ListNode(425,c);
        ListNode g = new ListNode(8,d);
        ListNode e = new ListNode(5,g);
        ListNode f = new ListNode(4,e);
        ListNode h = new ListNode(9,f);

        ListNode abc = sortList(h);
        printNodes(abc);
    }

    private static void printNodes(ListNode h) {

        while (h !=null){
            System.out.print(h.val + " --> ");
            h = h.next;
        }
    }

    public static ListNode sortList(ListNode head) {
        if(head == null){
            return head;
        }

        if(head.next == null){
            return head;
        }

        ListNode middle = middleNode(head);
        ListNode middleNext = middle.next;

        middle.next = null;


        ListNode left = sortList(head);
        ListNode right = sortList(middleNext);

        ListNode merged = mergeSorting(left, right);

        return merged;
    }

    private static ListNode middleNode(ListNode head) {
        if(head==null){
            return head;
        }else if(head.next == null){
            return head;
        }
        if(head.next.next == null){
            return head;
        }

        ListNode start = head;
        ListNode fast2 = head;

        while(fast2 != null && fast2.next!=null){
            start = start.next;
            fast2=fast2.next.next;
        }

        return start;
    }

    private static ListNode mergeSorting(ListNode a, ListNode b){
        ListNode temp = null;
        if(a == null){
            return b;
        }

        if(b==null){
            return a;
        }

        if(a.val <= b.val){
            temp = a;
            temp.next = mergeSorting(a.next, b);
        }else{
            temp = b;
            temp.next = mergeSorting(a, b.next);
        }

        return temp;
    }
}
