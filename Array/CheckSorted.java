package Array;

public class CheckSorted {
    public static void main(String[] args) {
      

        boolean res = check(arr);

        System.out.println(res);

    }

    public static boolean check(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = arr[i - 1];

            if (pre > curr) {
                return false;
            }
        }
        return true;
    }
}
