package com.learn.dsa.stack;

import java.util.Stack;

public class isValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( st.isEmpty()  && ( ch == ')' || ch == '}' || ch  == ']' ) ){
                return false;
            }else{
                if( ch == ')' && st.peek() == '(' ){
                    st.pop();
                }
                else if( ch == '}'&& st.peek() == '{'){
                    st.pop();
                }
                else if( ch == '[' && st.peek() == ']'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }


        }
         return st.isEmpty();
    }
}
