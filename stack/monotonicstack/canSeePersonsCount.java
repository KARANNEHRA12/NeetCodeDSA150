package com.learn.dsa.stack.monotonicstack;

import java.util.Arrays;
import java.util.Stack;

public class canSeePersonsCount {
    public static void main(String[] args) {
        int [] arr = {10,6,8,5,11,9};
        System.out.println(Arrays.toString(canSeePersonsCount(arr)));
    }
    public static int[] canSeePersonsCount(int[] heights) {
        int ans [] = new int [heights.length];
        Stack<Integer> st = new Stack<>();
        for( int i =0; i< heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] <= heights[i]){

                ans[st.pop()] +=1;

            }
            if( !st.isEmpty()){
                ans[st.peek()] +=1;

            }
            st.push(i);

        }
        return ans;

    }
}
