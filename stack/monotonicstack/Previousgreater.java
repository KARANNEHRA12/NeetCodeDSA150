package com.learn.dsa.stack.monotonicstack;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Previousgreater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        ;
        System.out.println(Arrays.toString(findpreviousGreater(arr)));
    }


    public static int[] findpreviousGreater(int [] arr){
        Stack<Integer> stack = new Stack<>();
        int[] previousGreater = new int[arr.length];
        Arrays.fill(previousGreater, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                previousGreater[i] = arr[stack.peek()];// for getting values
//                previousGreater[i] = stack.peek();// for getting indexes of previous greater element
            }
            stack.push(i);
        }
        return previousGreater;
    }



}
