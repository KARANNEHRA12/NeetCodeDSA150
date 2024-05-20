package com.learn.dsa.sorting;

public class MergeSort {
    public void mergeSort( int arr[] , int noofelements){
        if( noofelements < 2 ) return;
        int mid = noofelements /2;
        int [] leftArr = new int[mid];
        int [] rightArr = new int[noofelements - mid];
        for (int i = 0; i < mid ; i++) {
            leftArr[i] = arr[i];


        }
        for (int i = mid; i < noofelements - mid ; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr, mid);// sort the left array
        mergeSort(rightArr, noofelements - mid); // sort the right array
        merge(arr, leftArr, rightArr,mid, noofelements - mid);

    }
    public void merge( int [] arr , int [] leftArr, int [] rightArr , int left, int right){
        int i =0, j =0,  k =0;
        while ( i < left && j < right){
            if( leftArr[i] > rightArr[j]) {
                arr[k++] = rightArr[j++];
            }
            else{
                arr[k++]  = leftArr[i++];
            }
        }
        while ( i < left){
            arr[k++] = leftArr[i++];
        }
        while (j < right){
            arr[k++] = rightArr[j++];
        }
    }
}
