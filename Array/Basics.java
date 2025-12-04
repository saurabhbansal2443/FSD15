package Array;

public class Basics {
    public static void main(String[] args) {
        int[] arr = new int[5]; // [0,0,0,0,0]
        int[] arr2 = { 1, 2, 3, 4, 5 };

        int length2 = arr2.length;

        int ele = arr2[3];
        arr2[2] = 99;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // System.out.println(arr[2]);

    }
}
