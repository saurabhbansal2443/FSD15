package Loop;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        int n = 7;
        int m = 20;
        // 7 , 11 , 13 , 17 , 19

        for (int i = n; i <= m; i++) {
            int num = i;

            boolean flag = true;

            for (int j = 2; j <= n - 1; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(num);
            }
        }
    }
}
