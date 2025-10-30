package IFelse;

import java.util.*;

public class GradePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int cs = sc.nextInt();
        int bio = sc.nextInt();
        int maths = sc.nextInt();

        int total = phy + chem + cs + bio + maths;

        int percenatge = total / 5;

        if (percenatge >= 90) {
            System.out.println("Grade A ");
        } else if (percenatge >= 80) {
            System.out.println("Grade B ");
        } else if (percenatge >= 70) {
            System.out.println("Grade C");
        } else if (percenatge >= 60) {
            System.out.println("Grade D");
        } else if (percenatge >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade f ");
        }

    }
}
