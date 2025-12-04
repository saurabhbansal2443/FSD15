package Array;

public class Maximum {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 1, 0, 3, 9, 7, 2 };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // SpaceComplexity->O(1)
        // TimeComplexity->O(n)

        System.out.println(max);

    }
}
