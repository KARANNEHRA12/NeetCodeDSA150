package com.learn.dsa.sorting;

import java.util.Arrays;

public class CountingSort {
    public void countingSort(int [] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int range = max - min +1 ;
        int count[] = new int [range];
        int output[] = new int[arr.length];
        for( int j : arr){
            count[ j - min ]++; // for 0 base indexing

        }
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1];

        }

        // building output array
        for (int i = arr.length -1 ; i >=0 ; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;

        }
    }
}
