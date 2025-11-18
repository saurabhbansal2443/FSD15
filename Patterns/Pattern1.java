package Patterns;

public class Pattern1 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int st = 1; st <= row; st++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
