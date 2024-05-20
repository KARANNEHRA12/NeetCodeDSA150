package com.learn.dsa.tree.bst;

import com.learn.dsa.tree.TreeNode;

public class searchBST {

    public TreeNode searchBST(TreeNode root, int val) {
        if( root == null) return null;
        if( root.val == val){
            return root;
        }
        TreeNode ans = null;
        if( val < root.val){
            ans = searchBST( root.left , val);
        }
        else{
            ans = searchBST(root.right, val);
        }
        return ans;
    }
}
