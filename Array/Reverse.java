package Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // How do you reverse an array in Java?

        int[] arr = { 1, 4, 8, 3, 9, 2, 7 };

        // ReverseSelf(arr);
        int[] ans = Reverse(arr);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] Reverse(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            res[arr.length - 1 - i] = arr[i];
        }

        return res;

        // SpaceComplexity->O(n)
        // TimeComplexity->O(n)
    }

    public static void ReverseSelf(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int k = arr[st];
            arr[st] = arr[end];
            arr[end] = k;
            st++;
            end--;
        }

        // SpaceComplexity->O(1)
        // TimeComplexity->O(n)

    }
}
