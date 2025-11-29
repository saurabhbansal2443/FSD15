package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;

        for (int row = 1; row <= n; row++) {

            int val = 1;

            for (int st = 1; st <= nst; st++) {

                System.out.println(" " + val + " ");

                if (st < row) {
                    val++;
                } else {
                    val--;
                }
            }
            System.out.println();
            nst += 2;
        }
    }
}
