package String;

public class Compress {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaabbbbaaaaccccdeftiiiii";
        String compressed = compress(str);
        // System.out.println(compressed);
        System.out.println(decompress2("a13b4c2edf2e"));
    }

    public static String compress(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        String ans = "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (pre != curr) {
                if (count > 1) {
                    ans += count;
                }
                ans += pre;
                count = 1;
            } else {
                count++;
            }
        }

        if (count > 1) {
            ans += count;
        }
        ans += str.charAt(str.length() - 1);

        return ans;
    }

    public static String decompress1(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            if (curr >= '0' && curr <= '9') {
                char next = str.charAt(i + 1);
                int num = (int) (curr - '0');
                while (num > 0) {
                    ans += next;
                    num--;
                }
                i++;
            } else {
                ans += curr;
            }
        }
        return ans;
    }

    public static String decompress2(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        String ans = "";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);

            if (curr >= '0' && curr <= '9') {
                int currentFre = (int) (curr - '0');
                int idx = i + 1;
                while (idx < str.length() && str.charAt(idx) >= '0' && str.charAt(idx) <= '9') {
                    int digit = (int) (str.charAt(idx) - '0');
                    currentFre = currentFre * 10 + digit;
                    idx++;
                }
                while (currentFre > 0) {
                    ans += pre;
                    currentFre--;
                }
                i = idx;

            } else {
                ans += pre;
            }
        }
        char lc = str.charAt(str.length() - 1);
        if (lc < '0' || lc > '9') {
            ans += lc;
        }
        return ans;
    }
}
