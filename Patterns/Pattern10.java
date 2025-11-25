package Patterns;

public class Pattern10 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            int diff = n - 1;
            int print = row;

            for (int st = 1; st <= row; st++) {
                System.out.print(" " + print + " ");
                print = print + diff;
                diff--; 
            }
            System.out.println();
        }
    }
}
