package com.learn.dsa.tree;

public class DiameterofNtree {
    public int diameter( NTreeNode root){
        int maxi[] = new int [1];
        findheight(root , maxi);
        return maxi[0];
        
    }

    private int  findheight(NTreeNode root, int[] maxi) {
        if (root == null) return 0;
        int h1 =0;
        int h2 =0;
         int h =0;
         for( NTreeNode node : root.children){
              h = findheight(node, maxi);
              if( h > h1){
                  h2 = h1;
                   h1 = h;
              } else if ( h> h2 ){
                  h2 = h;

              }

         }
          maxi[0] = Math.max(maxi[0] , h1 + h2);
          return 1 + h1;
    }
}
