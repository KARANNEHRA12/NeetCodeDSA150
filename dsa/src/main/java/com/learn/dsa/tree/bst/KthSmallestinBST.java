package com.learn.dsa.tree.bst;

import com.learn.dsa.tree.TreeNode;

public class KthSmallestinBST {
    int pos=0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode node = inorder(root, k);
        if( node == null)
            return -1;

        return node.val;

    }
    public TreeNode inorder(TreeNode root , int k ){
        if(root == null) return root;

        TreeNode left = inorder(root.left, k);
        if( left != null){
            return left;
        }
        pos++;
        if( pos == k)
            return root;

        TreeNode right = inorder( root.right, k);
        if( right != null ) return right;
        return null;

    }
}
