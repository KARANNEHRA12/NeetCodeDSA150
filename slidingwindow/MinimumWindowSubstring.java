package com.learn.dsa.slidingwindow;

import java.util.HashMap;
import java.lang.*;

public class MinimumWindowSubstring {
//    public String minWindow(String s, String t) {
//        HashMap<Character, Integer> freqMap = new HashMap();
//
//        for (char c : t.toCharArray()) {
//            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//        }
//        int Have =0;
//        int left =0;
//        int minLen= s.length()+1;
//        int substrIdx  =0;
//        for (int right = 0; right < s.length() ; right++) {
//            char ch = s.charAt(right);
//            if( freqMap.containsKey(ch)){
//                freqMap.put(ch, freqMap.get(ch) -1 );
//                if( freqMap.get(ch) == 0) Have++;
//            }
//            while( Have == freqMap.size()){
//                if( minLen > right - left +1 ){
//                    minLen = right- left +1;
//                    substrIdx = left;
//
//                }
//                char deleted = s.charAt(left++);
//                if( freqMap.containsKey(deleted)){
//                    if( freqMap.get(deleted) == 0) Have--;
//                    freqMap.put(deleted, freqMap.get(deleted)+1);
//                }
//
//            }
//
//        }
//         return minLen > s.length() ? "" : s.substring(substrIdx, substrIdx+ minLen);
//
//    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freqMap = new HashMap();
//
        for (char c : t.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int windowStart =0;
        int windowend =0;
        int minlen = Integer.MAX_VALUE;
        int start=0;
        int matched =0;
        for( windowend =0; windowend< s.length();windowend++){
            char currChar = s.charAt(windowend);
            if( freqMap.containsKey(currChar)){
                freqMap.put(currChar, freqMap.get(currChar)-1);
                if(freqMap.get(currChar) >=0){
                    matched++;
                }


            }
            while( matched == t.length()){
                if( minlen > (windowend - windowStart + 1)){
                    minlen = windowend - windowStart + 1;
                    start = windowStart;
                }

                char leftChar = s.charAt(windowStart++);
                if( freqMap.containsKey(leftChar)){
                    if( freqMap.get(leftChar) == 0 ){
                            matched--;


                    }
                    freqMap.put(leftChar, freqMap.get(leftChar)+1);
                }
            }
        }
         return minlen > s.length() ? "": s.substring(start, start+ minlen);

    }

}
