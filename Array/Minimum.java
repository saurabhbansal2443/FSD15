package Array;

import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        // How do you find the minimum element in an array in Java?

        int[] arr = { 4, 2, 1, 0, 3, 9, 7, 2 };

        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // int ele = arr[i];
        // if (min > ele) {
        // min = ele;
        // }
        // }

        // SpaceComplexity->O(1)
        // TimeComplexity->O(n)

        // System.out.println(min);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
