package String;

public class Substring2 {
    public static void main(String[] args) {
        String str = "RADAR";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                boolean isPlaindrome = CheckPlaindrome2(str.substring(i, j));
                if (isPlaindrome) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    public static boolean CheckPlaindrome2(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char chSt = str.charAt(start);
            char chEd = str.charAt(end);

            if (chEd != chSt) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

}
