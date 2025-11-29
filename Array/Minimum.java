package Array;

import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 0, 3, 9, 7, 2 };

        int min = Integer.MAX_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // if (min > arr[i]) {
        // min = arr[i];
        // }
        // }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // System.out.println(min);

    }
}
