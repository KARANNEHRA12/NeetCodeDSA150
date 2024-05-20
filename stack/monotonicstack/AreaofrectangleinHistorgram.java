package com.learn.dsa.stack.monotonicstack;

import java.util.Stack;

public class AreaofrectangleinHistorgram {
    // using collection stack
//    public int largestRectangleArea(int[] heights) {
//        int max  = Integer.MIN_VALUE;
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i <= heights.length ; i++) {
//            int element  = ( i== heights.length) ? 0: heights[i];
//             while( !st.isEmpty() && heights[st.peek()] > element){
//                 int h = heights[st.pop()];
//                 int ps = (st.isEmpty())? -1 : st.peek();
//                 int w = i - ps -1;
//                 max = Math.max(max, (h * w));
//             }
//             st.push(i);
//
//        }
//         return ( max == Integer.MIN_VALUE)? 0: max;
//
//    }

    // using custom stack
    public int largestRectangleArea(int[] heights) {
        int max  = Integer.MIN_VALUE;
        int n = heights.length;
       int [] stack = new int[n+1];
       int index  =-1;
        for (int i = 0; i <= n; i++) {
            int element  = ( i== n) ? 0: heights[i];
            while( index != -1 && heights[stack[index]] > element){
                int h = heights[stack[index--]];
                int ps = (index == -1)? -1 : stack[index];
                int w = i - ps -1;
                max = Math.max(max, (h * w));
            }
           stack[++index]  = i;

        }
        return ( max == Integer.MIN_VALUE)? 0: max;

    }
}
