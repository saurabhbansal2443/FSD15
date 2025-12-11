package Array;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 9, 2, 1, 6, 8, 10, 3 };

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (max < ele) {
                smax = max;
                max = ele;
            } else if (smax < ele) {
                smax = ele;
            }
        }

        System.out.println(smax);

    }
}
