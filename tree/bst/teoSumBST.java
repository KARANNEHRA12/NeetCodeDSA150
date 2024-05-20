package com.learn.dsa.tree.bst;

import com.learn.dsa.tree.TreeNode;

import java.util.ArrayList;

public class teoSumBST {

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder( root, inorder);
        int start =0; int end  =inorder.size() -1;
        while( start< end){
            int sum  = inorder.get(start) + inorder.get(end);
            if( sum > k){
                end--;
            }
            else if ( sum < k){
                start++;

            }else{
                return true;
            }
        }
        return false;




    }
    public void inorder(TreeNode root , ArrayList<Integer> inorder){
        if(root == null) return ;
        inorder(root.left, inorder);
        inorder.add(root.val);
        inorder(root.right, inorder);


    }
}
