package IFelse;

public class OddEven {
    public static void main(String[] args) {
        // Write a program to find weather a number is even or odd
        int n = 5;

        int reminder = n % 2;

        if (reminder == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }
}
