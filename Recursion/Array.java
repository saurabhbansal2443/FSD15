package Recursion;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 11, 2, 8, 9, 0 };

        // displayArray(arr, 0);

        // System.out.println(max(arr, 0));
        System.out.println(firstOccurence(arr, 11, 0));
    }

    public static void displayArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr, idx + 1);
    }

    public static int max(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int pMax = max(arr, idx + 1);

        int self = arr[idx];

        return Math.max(self, pMax);

    }

    public static int firstOccurence(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return -1;
        } else if (arr[idx] == target) {
            return idx;
        }

        return firstOccurence(arr, target, idx + 1);

    }

}
