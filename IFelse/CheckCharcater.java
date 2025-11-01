package IFelse;

import java.util.*;

public class CheckCharcater {
    public static void main(String[] args) {
        // Write a program to check whether a given character is an Alphabet or not.

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        // type conversion

        // int asciiVal = (int) ch;

        // if (asciiVal >= 97 && asciiVal <= 122) {
        // System.out.println("LowerCase");
        // } else if (asciiVal >= 65 && asciiVal <= 90) {
        // System.out.println("UpperCase");
        // } else {
        // System.out.println("Not a valid alphabet ");
        // }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("No valid");
        }

    }

}
