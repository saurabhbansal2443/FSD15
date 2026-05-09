package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 2, 8, 3, 0 };

        for (int i = 0; i < arr.length - 1; i++) {

            int ele = arr[i];
            int min = Integer.MAX_VALUE;
            int idx = i + 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }

            if (ele > min) {
                int k = arr[i];
                arr[i] = arr[idx];
                arr[idx] = k;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
