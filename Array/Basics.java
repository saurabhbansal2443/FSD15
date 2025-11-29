package Array;

public class Basics {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 4, 3, 21, 9 };
        int[] arr2 = new int[9];

        int length = arr.length;

        // System.out.println(length);

        // System.out.println(arr);

        arr[4] = 7 ; 

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
