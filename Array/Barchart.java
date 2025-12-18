package Array;

public class Barchart {
    public static void main(String[] args) {
        // Write a program to print the array elements in the barchart form

        int[] arr = { 4, 3, 2, 1, 0, 5 };

        int maxLevel = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxLevel < arr[i]) {
                maxLevel = arr[i];
            }
        }

        for (int i = maxLevel; i >= 1; i--) {
            int currentLevel = i;

            for (int j = 0; j < arr.length; j++) {
                if (currentLevel <= arr[j]) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
