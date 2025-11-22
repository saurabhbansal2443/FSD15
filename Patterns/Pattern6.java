package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 2 * n - 1;
        for (int row = 1; row <= n; row++) { // row
            for (int sp = 1; sp <= row - 1; sp++) { // spaces
                System.out.print("   ");
            }
            for (int st = 1; st <= nst; st++) { // stars
                System.out.print(" * ");
            }
            System.out.println();
            nst -= 2;
        }
    }
}
