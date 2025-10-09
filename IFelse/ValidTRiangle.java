package IFelse;

import java.util.*;

public class ValidTRiangle {
    public static void main(String[] args) {
        // Write a program to input all angles of a triangle and
        // check whether it is valid or not

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sumOfAngles = a + b + c;

        if(sumOfAngles == 180 ){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
