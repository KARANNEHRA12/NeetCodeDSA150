package com.learn.dsa.slidingwindow;

import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// example input : abcabcbb
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scn = new Scanner((System.in));
        String s  = scn.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        List<Character> substring  = new ArrayList<>();
        int maxlen =0;
        for(int right =0; right  < s.length(); right++){
            if( substring.contains(s.charAt(right))){
                int index = substring.indexOf(s.charAt(right));
                System.out.println("index is ->"+ index);
                System.out.println(substring +"->"+ right);
                substring.remove(index);
                System.out.println(substring +"->"+ right);
                if( index > 0){ // for deleting whole substring if the character is in  between like :- for substring "abcb" here b is at index 1 so we need to remove whole suibstring for 0 to 1 index i.e: "ab"
                    substring.subList(0,index).clear();
                    System.out.println(substring +"->"+ right);
                }
            }
            substring.add(s.charAt(right));
            maxlen = Math.max(maxlen, substring.size());
        }
         return maxlen;
    }
}
