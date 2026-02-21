package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

    public static String reverse(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        String rem = str.substring(0, str.length() - 1);
        String remRev = reverse(rem);
        char lc = str.charAt(str.length() - 1);
        return lc + remRev;
    }
}
