package Functions;

public class Questions {
    public static void main(String[] args) {
        factorialPrint(0);
    }

    public static void factorialPrint(int n) {
        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println("Main logic started");
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        System.out.println("Main logic started");
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
