package Loop;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 6789;

        // int sum = 0;

        // while (n > 0) {
        // int ld = n % 10;
        // sum = sum * 10 + ld;
        // n = n / 10;
        // }

        // System.out.println(sum);

        int sum = 0;

        for (int i = n; i > 0; i = i / 10) {
            int ld = i % 10;

            sum = sum * 10 + ld;
        }

        System.out.println(sum);

    }
}
