package com.learn.dsa.sorting;

public class quickSort {
    public void quickSort(int [] arr, int begin , int end){
        if( begin< end){

            int partition = findPartition(arr, begin, end);

            quickSort(arr, begin, partition -1);
            quickSort(arr, partition, end );

        }
    }

    private int findPartition(int[] arr, int begin, int end) {
        // choosing pivot as last element
//        int pivot = arr[end];
//        int i = begin -1;
//        for (int j = begin; j < end ; j++) {

        // choosing pivot as first element
        int pivot = arr[begin];
        int i = begin;
        for (int j = begin + 1; j <= end  ; j++) {

            if( arr[j] < pivot){
                i++;
                swap( arr, i ,j );
            }

        }
        // choosing pivot as last element
//        swap(arr, i + 1, end);
//        return i + 1;
        // choosing pivot as first element
        swap( arr, begin, i);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
         int temp  = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
}
