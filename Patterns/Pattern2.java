package Patterns;

public class Pattern2 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int st = 1; st <= (n + 1 - row); st++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
