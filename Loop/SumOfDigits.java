package Loop;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 6789;

        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }

        System.out.println(sum);

    }
}
