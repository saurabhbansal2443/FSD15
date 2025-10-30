package IFelse;

public class MaximumOfThreeNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        int c = 17;

        if (a > b) {
            if (a > c) {
                System.out.println("a " + a);
            } else {
                System.out.println("c " + c);
            }
        } else if (b > c) {
            System.out.println("b " + b);
        } else {
            System.out.println("c " + c);
        }
    }
}
