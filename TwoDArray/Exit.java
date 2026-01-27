package TwoDArray;

public class Exit {

    class Solution {
        // https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1
        public int[] FindExitPoint(int n, int m, int[][] matrix) {
            // code here
            int row = 0;
            int col = 0;
            int aRow = 0;
            int aCol = 0;

            int d = 0;
            // d == 0 -> col++ d==1 -> row++ d=2 -> col-- d=3 -> row--

            while (row != -1 && col != -1 && row != n && col != m) {

                int ele = matrix[row][col];
                aRow = row;
                aCol = col;

                if (ele == 1) {
                    matrix[row][col] = 0;

                    d++;
                    d = d % 4;
                }

                if (d == 0) {
                    col++;
                } else if (d == 1) {
                    row++;
                } else if (d == 2) {
                    col--;
                } else {
                    row--;
                }

            }
            int[] ans = { aRow, aCol };
            return ans;
        }
    }
}
