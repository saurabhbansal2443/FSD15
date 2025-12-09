package Array;

public class Concat {
    public static void main(String[] args) {
        // How do you concatenate two arrays in Java?

        int[] arr1 = { 1, 3, 1, 6 };
        int[] arr2 = { 9, 2, 1 };

        int l1 = arr1.length;
        int l2 = arr2.length;

        int resLength = l1 + l2;

        int[] res = new int[resLength];

        for (int i = 0; i < resLength; i++) {
            int ele = 0;
            if (i < l1) {
                ele = arr1[i];
            } else {
                ele = arr2[i-l1];
            }
            res[i] = ele;
        }
    }
}
