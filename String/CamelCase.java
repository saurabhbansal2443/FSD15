package String;

public class CamelCase {
    public static void main(String[] args) {

        String str = "Hey i Love Java";

        String ans = convertToCamelCase(str);

    }

    public static String convertToCamelCase(String str) {
        if (str.length() == 0) {
            return str;
        }

        String ans = "";

        char fc = str.charAt(0);
        if (fc >= 'A' && fc <= 'Z') {
            fc = (char) (fc - 'A' + 'a');
        }
        ans += fc;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);

            if (pre == ' ' && curr >= 'a' && curr <= 'z') {
                curr = (char) (curr - 'a' + 'A');
            }
            if (curr != ' ') {
                ans += curr;
            }
        }
        return ans;
    }
}
