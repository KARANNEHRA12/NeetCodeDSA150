package com.learn.dsa.sorting;

public class BubbleSort {
    public void bubbleSort( int [] arr){
        int pass ,i;
        for (pass = arr.length - 1 ; pass >= 0 ; pass--){
            for (i = 0 ; i<= pass -1 ; i++){
                if( arr[i ] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+ 1];
                    arr[i+1 ] = temp;
                }
            }
        }
    }
    public  void bubbleSortModified(int [] arr){
        int pass ,i ;
        boolean swapped = true;
        for (pass = arr.length - 1 ; pass >= 0 && swapped ; pass--){
            swapped  =false;
            for (i = 0 ; i<= pass -1 ; i++){
                if( arr[i ] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+ 1];
                    arr[i+1 ] = temp;
                    swapped = true;
                }
            }
        }
    }
}
