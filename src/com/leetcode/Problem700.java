package com.leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Search in a Binary Search Tree
public class Problem700 {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null)
        {
            if(root.val==val) return root;
            else if(root.val<val)root=root.right;
            else if(root.val>val)root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {


        Problem700 p = new Problem700();
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        TreeNode result = p.searchBST(root, 5);
        System.out.println(result.val);
        if (result.left != null) {
            System.out.println(result.left.val);
        }
        if (result.right != null) {
            System.out.println(result.right.val);
        }
    }


}
