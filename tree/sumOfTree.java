package com.learn.dsa.tree;

public class sumOfTree {
    public int sumOftree( TreeNode root){
         if( root == null) return 0;

         int leftsum = sumOftree(root.left);
         int rightSum = sumOftree(root.right);
         return root.val + leftsum + rightSum;
    }

    public static void main(String[] args) {
        String str = "a2b2c3d2";
        String s = decompressString(str);
        System.out.println("Str is ->"+ s);

    }
    public static String decompressString(String s ){
        StringBuilder sb = new StringBuilder();
        for( int i =0 ; i< s.length(); i+=2){
            char ch = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i + 1));
            System.out.println(count);
            for( int j =0; j< count ; j++){
                sb.append(ch);
            }

        }
        return sb.toString();
    }

}
