package Loop;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a string and then prints the
        // reverse of that string using a loop.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int length = str.length();

        String ans = "";

        for (int i = length - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans = ans + ch;
        }

        System.out.println(ans);
    }
}
