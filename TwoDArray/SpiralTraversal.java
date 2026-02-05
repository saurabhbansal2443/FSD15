package TwoDArray;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 99 },
                { 5, 6, 7, 8, 991 },
                { 9, 10, 11, 12, 9911 },

        };
        int rowMin = 0;
        int rowMax = arr.length - 1;
        int colMin = 0;
        int colMax = arr[0].length - 1;

        int totalElements = arr.length * arr[0].length;
        int count = 0;

        while (count < totalElements) {

            for (int c = colMin; c <= colMax && count < totalElements; c++) {
                count++;
                System.out.print(arr[rowMin][c] + " ");
            }
            System.out.println();
            for (int r = rowMin + 1; r <= rowMax && count < totalElements; r++) {
                count++;
                System.out.print(arr[r][colMax] + " ");
            }
            System.out.println();
            for (int c = colMax - 1; c >= colMin && count < totalElements; c--) {
                count++;
                System.out.print(arr[rowMax][c] + " ");
            }
            System.out.println();
            for (int r = rowMax - 1; r >= rowMin + 1 && count < totalElements; r--) {
                count++;
                System.out.print(arr[r][colMin] + " ");
            }
            System.out.println();
            rowMin++;
            rowMax--;
            colMin++;
            colMax--;

        }

    }
}
