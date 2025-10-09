package IFelse;

import java.util.*;

public class PositiveNegative {
    public static void main(String[] args) {
        // Take input of a number and Write a program to check whether a number is
        // negative, positive or zero

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }
}
