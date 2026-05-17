package Sorting;

import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 9, 7, 4, 2, 5, 0, 6 };

        int start = 0;
        int end = 0;

        int pivot = 5;

        while (start < arr.length) {

            if (pivot >= arr[start]) {
                int k = arr[end];
                arr[end] = arr[start];
                arr[start] = k;

                end++;
            }
            start++;

        }
        System.out.println(end);
        System.out.println(Arrays.toString(arr));
    }
}
