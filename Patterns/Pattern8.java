package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = n / 2;
        int nst = 1;

        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("   ");
            }
            for (int st = 1; st <= nst; st++) {
                if (st == 1 || st == nst) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

            if (row <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
        }

    }
}
