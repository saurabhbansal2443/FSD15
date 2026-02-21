package Recursion;

public class Fibbonnaci {
    public static void main(String[] args) {
        int n = 5;
        int ans = fib(n);

        System.out.println(ans);
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int prePre = fib(n - 2);
        int pre = fib(n - 1);
        return pre + prePre;
    }

}
