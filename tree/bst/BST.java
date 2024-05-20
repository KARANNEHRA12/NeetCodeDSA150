package com.learn.dsa.tree.bst;

import com.learn.dsa.tree.TreeNode;


class BST {
    public static TreeNode Constructbst(int[] arr) {
        TreeNode root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insertIntoBST(root, arr[i]);

        }
        return root;


    }

    public static  TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;


    }
}

