package TwoDArray;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 4 },
                { 7, 8, 9 },
                { 12, 13, 14 },
        };

        for (int r = 0; r < arr.length; r++) {
            for (int c = r; c < arr.length; c++) {
                int k = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = k;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
