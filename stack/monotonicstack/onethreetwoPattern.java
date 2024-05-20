package com.learn.dsa.stack.monotonicstack;

import java.util.Stack;

public class onethreetwoPattern {
    public boolean find132pattern(int[] nums) {
        int[] minimum = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < minimum.length; i++) { // for finding previous minimum element of each element
            if (i == 0) {
                minimum[i] = 0;
            } else {
                if (nums[i] < nums[minimum[i - 1]]) {
                    minimum[i] = i;
                } else {
                    minimum[i] = minimum[i - 1];
                }
            }

        }
        // for finding previous greater of each element
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            // if there is a previous greater element, stack will not be empty
            if (!st.isEmpty()) {
                if (nums[minimum[st.peek()]] < nums[i]) { // if the previous minimum for the previous greater element is
                    // less than the current number, then we return true
                    return true;
                }

            }
            st.push(i);

        }
        return false;

    }
}
