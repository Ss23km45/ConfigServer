package com.codingninja.practise.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class InOrderTraversal {

    public static void main(String[] args) {
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        return inOrder(root, myList);
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private List<Integer> inOrder(TreeNode root, List<Integer> myList) {
        if(root == null){
            return myList;
        }

        inOrder(root.left, myList);
        myList.add(root.val);
        inOrder(root.right, myList);

        return myList;
    }
}