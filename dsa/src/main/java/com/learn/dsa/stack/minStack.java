package com.learn.dsa.stack;

import java.util.Stack;

public class minStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public minStack() {
            stack = new Stack();
            minStack = new Stack();

        }

        public void push(int val) {
            stack.push(val);
            val = Math.min(val, minStack.isEmpty()? val: minStack.peek());
            minStack.push(val);

        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
          return minStack.peek();
        }
}
