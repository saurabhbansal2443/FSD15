package TwoDArray;

public class Basic {
    public static void main(String[] args) {
        // int[] sample = {1,2,3,4};
        // int[] arr = new int[7];
        // int[][] arr = new int[3][4];

        int[][] arr2 = {
                { 1, 2, 4 },
                { 1, 2, 4, 5, 6 },
                { 1, 2, 3, 5, 6, 7 }
        };

        for (int i = 0; i < arr2.length; i++) {
            ;
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }

        // for (int i = 0; i < arr2.length; i++) {
        // int[] res = arr2[i];
        // for (int j = 0; j < res.length; j++) {
        // System.out.print(res[j]);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < arr2.length; i++) {

        // for (int j = 0; j < arr2[0].length; j++) {
        // System.out.print(arr2[i][j]);
        // }
        // System.out.println();
        // }

        // System.out.println(arr2[0][1]);

        int[][] arr = {
                { 10, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                int ele = arr[i][j];
                if (max < ele) {
                    max = ele;
                }
            }
        }

        System.out.println(max);

        for (int j = 0; j < arr[0].length; j++) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

    }

}
