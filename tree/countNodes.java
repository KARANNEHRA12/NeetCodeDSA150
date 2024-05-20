package com.learn.dsa.tree;

public class countNodes {
    public int countNodes( TreeNode root){
        if ( root == null) return 0;
        int leftHeight = findLeftheight(root);
        int rightHeight = findRightHeight(root);
        if( leftHeight == rightHeight){
            return  ((int)Math.pow(2 , leftHeight) -1);
        }
         return  1 + countNodes(root.left)+ countNodes(root.right);


    }
    public  int findLeftheight(TreeNode root){
        int count= 1;
        while (root.left != null){
            count++;
            root= root.left;

        }
         return  count;
    }
    public  int findRightHeight(TreeNode root){
        int count= 1;
        while (root.right != null){
            count++;
            root= root.right;

        }
        return  count;
    }
}
