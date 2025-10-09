package IFelse;

import java.util.*;

public class MutipleOf5 {
    public static void main(String[] args) {
        /// Write a Java program to check whether the given integer is a multiple of 5

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int rem = a % 5;

        if(rem == 0 ) System.out.println("yes");
        else System.out.println("No");

    }
}
