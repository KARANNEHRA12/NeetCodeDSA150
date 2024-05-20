package com.learn.dsa.stack.monotonicstack;

import java.util.Arrays;
import java.util.Stack;

public class previousSmaller {

    public static void main(String[] args) {
        int [] arr = {13, 8, 1, 5, 2, 5, 9, 7, 6, 12};
        System.out.println(Arrays.toString(findPreviousSmaller(arr)));
    }


    public static int[] findPreviousSmaller(int [] arr){
        Stack<Integer> stack = new Stack<>();
        int[] previousSmaller = new int[arr.length];
        Arrays.fill(previousSmaller, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {

                stack.pop();
            }
            if(!stack.isEmpty()){
//                previousSmaller[i] = stack.peek(); // for storing indexes
                previousSmaller[i] = arr[stack.peek()]; // for storing values
            }


            stack.push(i);
        }
        return previousSmaller;
    }
}
