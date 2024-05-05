package com.learn.dsa.stack.monotonicstack;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scn.nextInt();

        }
        System.out.println("nextGreaterElements -->" + nextGreaterElements(arr));
    }

    public static  int[] nextGreaterElements(int[] nums) {
        int [] ans  = new int[nums.length];
        Stack<Integer> st = new Stack<>();
            for( int j =0 ; j< 2 ; j++){
                for( int i =0; i < nums.length; i++){
                    while( !st.isEmpty() && nums[st.peek()] < nums[i] ){

                        ans[st.pop()] = nums[i];
                    }
                    st.push(i);

                }

            }
             return ans;


    }
}
