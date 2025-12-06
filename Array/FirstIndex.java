package Array;

public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 0, 3, 9, 7, 2 };
        int ele = 8;

        int idx = findFirstIndex(arr, ele);

        System.out.println(idx);
    }

    public static int findFirstIndex(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (ele == target) {
                return i;
            }
        }

        return -1;
    }
}
