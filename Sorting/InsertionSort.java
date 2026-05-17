package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 2, 8, 3, 0 };

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i]) {
                for (int j = i; j > 0; j--) {

                    if (arr[j - 1] > arr[j]) {
                        int k = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = k;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
