package IFelse;

import java.util.*;

public class CheckLowerUpper {
    public static void main(String[] args) {
        // Write a program to check whether
        // a character is uppercase or lowercase
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        // // 1 convert to ASCII
        // // ans = type casting

        // int asciiVal = (int) ch;

        // if (asciiVal >= 97 && asciiVal <= 122) {
        // System.out.println("lowercase");
        // } else if (asciiVal >= 65 && asciiVal <= 90) {
        // System.out.println("Upper case");
        // }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase ");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase ");
        }

    }
}
