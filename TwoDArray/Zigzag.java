package TwoDArray;

public class Zigzag {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 4, 5, 6 },
                { 7, 8, 9, 10, 11 },
                { 12, 13, 14, 15, 16 },
        };

        // Column wise
        // for (int j = 0; j < arr[0].length; j++) {
        // if (j % 2 == 0) {
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // } else {
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i][j] + " ");
        // }
        // }
        // System.out.println();
        // }

        for (int r = 0; r < arr.length; r++) {
            if (r % 2 == 0) {

                for (int c = 0; c < arr[r].length; c++) {
                    System.out.print(arr[r][c] + "");
                }

                System.out.println();

            } else {
                for (int c = arr[r].length - 1; c >= 0; c--) {
                    System.out.print(arr[r][c] + "");
                }

                System.out.println();
            }
        }
    }
}
