package Array;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr2 = { 1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7 };
        int ele = 2;
    }

    public static int frequncy(int tar, int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (tar == arr[i]) {
                count++;
            }
        }

        return count;

    }
}
