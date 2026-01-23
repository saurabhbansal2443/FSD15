package TwoDArray;

public class Minimum {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 4 },
                { 1, 2, 4, 5, 6 },
                { 1, 2, 3, 5, 6, 7 }
        };

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int ele = arr[i][j];

                if (min > ele) {
                    min = ele;
                }
            }
        }

        System.out.println(min);
    }
}
