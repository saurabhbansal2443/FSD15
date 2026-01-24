package TwoDArray;

public class SumOfArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 4 },
                { 1, 2, 4, 5, 6 },
                { 1, 2, 3, 5, 6, 7 }
        };

        int sum = 0;
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                count++; 
            }
        }


        System.out.println(sum/count);
    }
}
