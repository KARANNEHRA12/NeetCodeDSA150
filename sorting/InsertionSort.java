package com.learn.dsa.sorting;

public class InsertionSort {
    public void insertionSort(int [] arr ){
        int j =0;
        for (int i =1; i<= arr.length; i++){
            int key = arr[i];
            j =i;
            while (j>= 1 && arr[j-1]  > key ){
                arr[j]  = arr[j-1 ];
                j = j-1;
            }
            arr[j] = key;
        }
    }
}
