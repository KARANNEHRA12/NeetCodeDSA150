package com.learn.dsa.tree.bst;

import com.learn.dsa.tree.TreeNode;

public class MaxPathSumBST {

    public static void main(String[] args) {
        // Creating a binary tree for testing
         int [] arr = {1,2,3};
        TreeNode root = BST.Constructbst(arr);
        System.out.println(maxPathSum(root));

        // Test your maxPathSum method

    }

    static int ans;
    public static int maxPathSum(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;

    }
    public static int[] dfs( TreeNode root){

        if(root == null)
        {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }
        int leftSubTree[] = dfs(root.left);
        int rightSubTree[] = dfs(root.right);
        if( root.val > leftSubTree[1] && root.val < rightSubTree[0]){
            int currSum = leftSubTree[2] + rightSubTree[2] + root.val;
            ans = Math.max( ans, currSum);
            int minVal = Math.min(root.val, leftSubTree[0]);
            int maxVal = Math.max(root.val, rightSubTree[1]);
            return new int[]{ minVal, maxVal, currSum};
        }
        int maxSum = Math.max( leftSubTree[2], rightSubTree[2]);
        return new int[]{ Integer.MIN_VALUE,Integer.MAX_VALUE, maxSum};
    }
}
