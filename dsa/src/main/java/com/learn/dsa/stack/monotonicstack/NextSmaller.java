package com.learn.dsa.stack.monotonicstack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextSmaller {
    public static void main(String[] args) {
        int [] arr = {13, 8, 1, 5, 2, 5, 9, 7, 6, 12};
        System.out.println(Arrays.toString(findnextSmaller(arr)));
    }


    public static int[] findnextSmaller(int [] arr){
        Stack<Integer> stack = new Stack<>();
        int[] previousSmaller = new int[arr.length];
        Arrays.fill(previousSmaller, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {

//                previousSmaller[stack.pop()] = i;// for getting values
                previousSmaller[stack.pop()] = arr[i];// for getting indexes of previous greater element
            }


            stack.push(i);
        }
        return previousSmaller;
    }


}
