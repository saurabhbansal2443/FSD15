package Loop;

public class Even {
    public static void main(String[] args) {
        // Write a program that asks the user to enter a number and then prints all the
        // even numbers from 0 to that number using a loop.
        int n = 100;

        // for (int i = 0; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

    }
}