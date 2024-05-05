package com.learn.dsa.stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class carFleet {
    public int carFleet(int target, int[] position, int[] speed) {
           if (position.length ==1) return 1;
           int [][] combine = new int[position.length][2];
           Stack<Double> st = new Stack<>();
           for (int i =0 ; i< position.length; i++){
               combine[i][0] = position[i];
               combine[i][1] = speed[i];
           }
        Arrays.sort(combine, Comparator.comparingInt(o-> o[0]));
        for (int i = combine.length -1 ; i>=0 ; i--){
            double currentTime = ( double) ( target - combine[i][0]) / combine[i][1];
            if( !st.isEmpty() &&  currentTime <= st.peek()){
                continue;
            }
            else{
                    st.push(currentTime);
            }
            
        }return st.size();


    }
}
