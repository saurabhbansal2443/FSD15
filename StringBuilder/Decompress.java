package StringBuilder;

public class Decompress {
    public static void main(String[] args) {
        String str = "a14b6c7d2efghi";

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr >= '0' && curr <= '9') {
                int fre = (int) (curr - '0');
                int idx = i + 1;
                while (idx < str.length()  && str.charAt(idx) >= '0' && str.charAt(idx) <= '9') {
                    fre = fre * 10 + (int) (str.charAt(idx) - '0');
                    idx++;
                }
                while (fre > 0) {
                    sb.append(prev);
                    fre--;
                }
                i = idx;

            } else {
                sb.append(prev);
            }

        }

        if (str.charAt(str.length() - 1) >= 'a' && str.charAt(str.length() - 1) <= 'z') {
            sb.append(str.charAt(str.length() - 1));
        }

        System.out.println(sb);

    }
}
