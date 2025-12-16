package Array;

public class MissingNumber {
    // Write a program to find the missing number in a given range of integers
    // represented by an array.
    // https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] arr) {

        int n = arr.length;
        long ogSum = (long) (n * (n + 1)) / 2;

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = (long) sum + arr[i];
        }

        int ans = (int) (ogSum - sum);
        return ans;
    }

}
