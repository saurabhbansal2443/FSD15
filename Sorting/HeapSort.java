package Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = { 7,1,4,4,9,0,5,9,2,7};

        QuickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSort(int[] arr, int start, int end) {

        if (start == end) {
            return;
        }

        int pivotIndex = pivotIndex(arr, start, end, arr[end]);

        QuickSort(arr, start, pivotIndex - 1);
        QuickSort(arr, pivotIndex, end);

    }

    public static int pivotIndex(int[] arr, int start, int end, int pivot) {
        int ptr = start ; 
        while (start <= end) {

            if (pivot >= arr[start]) {
                int k = arr[ptr];
                arr[ptr] = arr[start];
                arr[start] = k;

                ptr++;
            }
            start++;

        }
        if(ptr == end +1){
            return end ; 
        }
        return ptr;
    }
}
