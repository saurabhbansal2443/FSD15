package StringBuilder;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AaaabbbbbbBbbBBBccccCCCCdddabcdefghi";

        boolean[] hasCome = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            int idx = (int) (ch - 'a');
            if (hasCome[idx] == false) {
                sb.append(ch);
                hasCome[idx] = true;
            }
        }

        System.out.println(sb.toString());

    }
}
