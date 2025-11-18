package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 7;
        // for (int row = 1; row <= n; row++) { // for putting the cursor at start of
        // rows
        // // for spaces
        // for (int sp = 1; sp <= (n - row); sp++) {
        // System.out.print(" ");
        // }
        // // for stars
        // for (int st = 1; st <= (2 * row - 1); st++) {
        // System.out.print(" * ");
        // }
        // // linechnage
        // System.out.println();

        // }
        int nst = 1;
        for (int row = 1; row <= n; row++) { // for putting the cursor at start of rows
            // for spaces
            for (int sp = 1; sp <= (n - row); sp++) {
                System.out.print("   ");
            }
            // for stars
            for (int st = 1; st <= nst; st++) {
                System.out.print(" * ");
            }
            // linechnage
            System.out.println();
            nst += 2;

        }
    }
}
