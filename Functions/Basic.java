package Functions;

public class Basic {
    public static void main(String[] args) { // main Function
        int c = 10;
        int d = 20;

        int ans = sum(c, d);

        System.out.println(ans);
    }

    public static void Greet() {
        System.out.println("Good Morning");
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
