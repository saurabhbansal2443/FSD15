package String;

public class Palindrome {
    public static void main(String[] args) {
        // Write a Java program to check if a string is a palindrome.
        String str = "RADAR";

        System.out.println(CheckPlaindrome1(str));
    }

    public static boolean CheckPlaindrome1(String str) {
        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans += ch;
        }
        if (str.equals(ans)) {
            return true;
        } else
        {
            return false;
        }
    }
     public static boolean CheckPlaindrome2(String str) {
        
    }
}
