package com.codingninja.practise.leetcode.solutions.linkedlist;

class MergeTwoLists {
    static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public static void main(String[] args) {
        ListNode mode = new ListNode(5);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);

        node2.next = node1;
        node1.next = mode;

        while(node2!=null){
            System.out.print(node2.val + " --> ");
            node2 = node2.next;
        }

        ListNode mo = new ListNode(8);
        ListNode no = new ListNode(5);
        ListNode n1o = new ListNode(2);

        n1o.next = no;
        no.next = mo;

       ListNode myNode = mergeTwoLists(mode, n1o);

       while(myNode!=null){
           System.out.print(myNode.val + " --> ");
           myNode = myNode.next;
       }

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        ListNode myList = null;
        ListNode head;
        if(list1.val < list2.val){
            myList = new ListNode(list1.val);
            list1 = list1.next;
        }else{
            myList = new ListNode(list2.val);
            list2 = list2.next;
        }



        head = myList;

        while(list1 != null && list2!=null){
            if(list1.val < list2.val){
                myList.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                myList.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            myList = myList.next;

        }

        if(list1 == null && list2!=null){
            myList.next = list2;
        }else if(list1 != null && list2 ==null){
            myList.next = list1;
        }

        return head;
    }

}