package com.learn.dsa.slidingwindow;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationinString {
    public static void main(String[] args) {
        Scanner scn = new Scanner((System.in));
        String s1  = scn.nextLine();
        String s2 = scn.nextLine();
        System.out.println(checkInclusion(s1,s2 ));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int s1len = s1.length();
        int s2len= s2.length();
        int [] str1 = new int[26];
        int[] str2 = new int[26];
        for(int i =0; i<s1.length() ;i++){
            str1[s1.charAt(i)- 'a']++;

        }
        int left =0;
        for( int right =0; right < s2len; right++){
            str2[s2.charAt(right) - 'a']++;
             if( right >= s1len){
                 str2[s2.charAt(right - s1len) -'a']--;

             }
             if(Arrays.equals(str1,str2)){
                 return true;
             }
        }
         return false;

    }
}
