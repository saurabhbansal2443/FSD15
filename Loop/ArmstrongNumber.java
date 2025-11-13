package Loop;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Armstrong number

        int n = 153;
        int ncopy = n;

        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld * ld * ld;
            n = n / 10;
        }

        if (sum == ncopy) {
            System.out.println("Armstrong ");
        } else {
            System.out.println("Not");
        }
    }
}
