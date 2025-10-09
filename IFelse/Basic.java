package IFelse;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        // write a program to take input of user's age
        // and tell him weather he can vote or not

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age ");

        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("He can vote");
        } else {
            System.out.println("He can not vote");
        }
    }
}
