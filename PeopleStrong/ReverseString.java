package org.example;

import java.util.Arrays;

public class ReverseString {

    public static String reverseHelper( char[] charArray){
        int l =0; int r =  charArray.length -1 ;
        while( l < r){
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }
        return  new String(charArray);


    }

        public static String reverseString1( String str){
            String [] strArray = str.split(" ");
            StringBuilder sb = new StringBuilder();
    //        for( String s : strArray){
    //            char[] ch = s.toCharArray();
    //            sb.append(reverseHelper(ch));
    //            sb.append(" ");
    //
    //
    //        }
            int l =0; int r =  strArray.length -1 ;
            while( l < r){
                String temp = strArray[l];
                strArray[l] = strArray[r];
                strArray[r] = temp;
                l++;
                r--;
            }
            for (String s : strArray){
                sb.append(s);
                sb.append(" ");
            }
            return sb.toString();



    }

    public static void main(String[] args) {
        System.out.println("str is -->" + reverseString1("Welcome to Coding Ninjas"));

    }
}
