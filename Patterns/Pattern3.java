package Patterns;

public class Pattern3 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) { // for putting the cursor at start of rows

            // for spaces
            for (int sp = 1; sp <= (n - row); sp++) {
                System.out.print("   ");
            }
            // for stars
            for (int st = 1; st <= row; st++) {
                System.out.print(" * ");
            }
            // linechnage
            System.out.println();

        }
    }
}
