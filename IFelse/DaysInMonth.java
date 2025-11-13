package IFelse;

import java.util.*;

public class DaysInMonth {
    public static void main(String[] args) {
        // Write a Java program to find days in a month (Take input of Year and month
        // number).

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 Days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        } else if (month == 2 && year % 4 == 0) {
            System.out.println("29 Days");
        } else if (month == 2) {
            System.out.println("28 Days");
        } else {
            System.out.println("Invalid Month number");
        }
    }
}
