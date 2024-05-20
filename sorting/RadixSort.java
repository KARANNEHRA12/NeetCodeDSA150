package com.learn.dsa.sorting;

import java.util.Arrays;

public class RadixSort {
    public void radixSort(int[] arr) {

        boolean isNegative = false;
        for (int i : arr){
            if( i < 0){
                isNegative =true;
                break;
            }
        }
        int min = 0;
        if(isNegative){
            min = Arrays.stream(arr).min().getAsInt();
            for( int i =0 ; i< arr.length ; i++){
                arr[i] -=min;
            }
        }
        int max = Arrays.stream(arr).max().getAsInt();
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(arr, place);
        }
        for (int i = 0; i < arr.length; i++) {
             arr[i] += min;
        }
    }

    private void countingSort(int[] arr, int place) {
    int size = arr.length;
    int max = Arrays.stream(arr).max().getAsInt();
    int [] count = new int[max +1];
    int [] output = new int[size + 1];
    
    for(int i : arr){
        count[ (i/place) % 10]++;
    }
    // calculate cumulative count 
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i -1];
            
        }
        
        //place element in sorted order
        for (int i = size - 1; i >= 0 ; i--) {
            output[count[(arr[i] /place) % 10] - 1] = arr[i];
            count[(arr[i] /place) % 10]--;
            
        }
        System.arraycopy(output, 0, arr, 0 , size);
    
    }
}
