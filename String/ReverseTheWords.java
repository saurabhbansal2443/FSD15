package String;

public class ReverseTheWords {
    public static void main(String[] args) {
        String str = "Hey I love java";
        // Case1 -> yeH I evol avaj
        // Case2 -> java love I Hey

        String cas1String = Case1(str);

        System.out.println(cas1String);

        // Case2
        String rev = reverse(str);
        String cas2String = Case1(rev);

        System.out.println(cas2String);

    }

    public static String Case1(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        String word = "";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                String revWord = reverse(word);
                ans += revWord + " ";
                word = "";
            }
        }

        if (word.length() > 0) {
            String revWord = reverse(word);
            ans += revWord;
        }
        return ans;
    }

    public static String Case2(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        String word = "";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                ans += word + " ";
                word = "";
            }
        }
        if (word.length() > 0) {
            ans = word + ans;
        }
        return ans;
    }

    public static String reverse(String str) {
        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans += ch;
        }
        return ans;
    }
}
