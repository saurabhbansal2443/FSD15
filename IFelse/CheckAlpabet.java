package IFelse;

import java.util.*;

public class CheckAlpabet {
    public static void main(String[] args) {
        // Write a program to input any alphabet and
        // check whether it is vowel or consonant

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
