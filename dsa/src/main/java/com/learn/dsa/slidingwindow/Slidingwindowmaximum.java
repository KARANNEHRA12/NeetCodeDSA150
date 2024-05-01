package com.learn.dsa.slidingwindow;

import java.util.*;

public class Slidingwindowmaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        int i =0;

        Deque<Integer> deque = new ArrayDeque<Integer>();
        for (int j = 0; j < nums.length ; j++) {
            if( !deque.isEmpty() && deque.peek()  == j - k){
                deque.pollFirst();
            }
            while( !deque.isEmpty() && nums[deque.peekLast()] < nums[j]){
                deque.pollLast();
            }
            deque.offer(j);
            if( j >= k - 1){
                ans[i++]= nums[deque.peek()];

            }


        }
             return ans;

    }
}
