package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = n - 1;
        int nst = 1;
        for (int row = 1; row <= 2 * n - 1; row++) { // row
            for (int sp = 1; sp <= nsp; sp++) { // spaces
                System.out.print("   ");
            }
            for (int st = 1; st <= nst; st++) { // stars
                System.out.print(" * ");
            }
            System.out.println();
            if (row < n) {
                nst++;
                nsp--;
            } else {
                nst--;
                nsp++;
            }
        }
    }
}
