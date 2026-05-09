package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 2, 8, 3, 0 };

        System.out.println(Arrays.toString(customMergesort(arr, 0, arr.length - 1)));
    }

    public static int[] customMergesort(int[] arr, int st, int end) {

        if (end == st) {
            int[] narr = new int[1];
            narr[0] = arr[end];
            return narr;
        }

        int mid = (st + end) / 2;

        int[] fsp = customMergesort(arr, st, mid);
        int[] ssp = customMergesort(arr, mid + 1, end);

        return mergeTwoSortedArray(fsp, ssp);
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;

        int resLength = l1 + l2;
        int[] res = new int[resLength];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p3 < resLength) {
            int ele1 = p1 < l1 ? arr1[p1] : Integer.MAX_VALUE;
            int ele2 = p2 < l2 ? arr2[p2] : Integer.MAX_VALUE;

            if (ele1 < ele2) {
                res[p3] = ele1;
                p1++;
            } else {
                res[p3] = ele2;
                p2++;
            }
            p3++;

        }
        return res;
    }
}
