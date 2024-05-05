package com.learn.dsa.stack;

import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack();

        Arrays.fill(ans, -1);
        for (int i = 0; i < temperatures.length ; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int prevDay = st.pop();
                ans[prevDay] = i - prevDay;
            }
            st.add(i);

        }
         return ans;
    }
}
