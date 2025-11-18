package Patterns;

public class Pattern4 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) { // for putting the cursor at start of rows

            // for spaces
            for (int sp = 1; sp <= (row - 1); sp++) {
                System.out.print("   ");
            }
            // for stars
            for (int st = 1; st <= (n + 1 - row); st++) {
                System.out.print(" * ");
            }
            // linechnage
            System.out.println();

        }
    }
}
