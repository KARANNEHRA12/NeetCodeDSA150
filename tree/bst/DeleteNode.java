package com.learn.dsa.tree.bst;

import com.learn.dsa.tree.TreeNode;

public class DeleteNode {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if( root == null) return root;
            if( key < root.val){
                root.left = deleteNode( root.left, key);
            }else if( key > root.val){
                root.right = deleteNode(root.right, key);
            }
            else{
                // leaf node
                if( root.left == null && root.right == null){
                    return null;

                }
                // 1 child
                if( root.left == null){
                    return root.right;
                }
                else if( root.right == null) return root.left;

                    // 2 child
                else{
                    // using predecessor start
                    // TreeNode node = findPredecessor( root.left);
                    // //copy value;
                    // root.val = node.val;
                    // // delete node
                    // root.left = deleteNode(root.left, node.val);
                    // using predecessor end
                    // using successor start
                    TreeNode node = findsuccessor(root.right);
                    root.val = node.val;
                    root.right = deleteNode( root.right,node.val);
                    // using predecessor end
                }
            }
            return root;


        }

        public TreeNode findPredecessor(TreeNode root){
            while( root.right !=  null){
                root = root.right;
            }
            return root;
        }
        public TreeNode findsuccessor(TreeNode root){
            while( root.left !=  null){
                root = root.left;
            }
            return root;
        }
    }
}
