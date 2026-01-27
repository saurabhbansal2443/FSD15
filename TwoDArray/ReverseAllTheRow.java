package TwoDArray;

public class ReverseAllTheRow {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 4 },
                { 7, 8, 9 },
                { 12, 13, 14 },
        };

        for (int i = 0; i < arr.length; i++) {
            int[] arr2 = arr[i];
            ReverseSelf(arr2);
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

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

    }
}
