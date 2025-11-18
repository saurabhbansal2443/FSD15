package Loop;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n = 5;
        int x = 3;

        int ans = 1;

        for (int i = 1; i <= x; i++) {
            ans *= n;
        }

        System.out.println(ans);
    }
}
