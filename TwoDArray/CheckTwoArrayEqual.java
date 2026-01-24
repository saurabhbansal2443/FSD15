package TwoDArray;

public class CheckTwoArrayEqual {
    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 4, 5, 6 },
                { 1, 2, 4, 5, 6 },
                { 1, 2, 4, 5, 6 },
        };
        int[][] arr2 = {
                { 1,2 , 4, 5, 6 },
                { 1, 2, 4, 5, 6 },
                { 1, 2, 4, 5, 6 },
        };

        System.out.println(check(arr1, arr2));
    }

    public static boolean check(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
