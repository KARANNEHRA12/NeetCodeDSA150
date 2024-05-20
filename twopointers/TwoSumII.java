package com.learn.dsa.twopointers;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
//        int [] ans = new int[2];
        int li =0;
        int  ri = numbers.length-1;
        while( li < ri ){
                int left  = numbers[li];
                int right = numbers[ri];
                if( left + right == target ){
                       break;
                }
                if( left + right < target ){
                    li++;
                    continue;

                }

                    ri--;


        }
        return new int []{ li+1, ri +1};
    }
}
