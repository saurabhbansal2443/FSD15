package IFelse;

import java.util.*;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        // Type conversion

        int asciiVal = (int) ch;

        // System.out.println(asciiVal);

        if (asciiVal >= 65 && asciiVal <= 90) { // Upper case
            System.out.println(" It is a Alphabet");
        } else if (asciiVal >= 97 && asciiVal <= 122) {
            System.out.println("Alpabhetr"); // lowercase
        } else {
            System.out.println("Not");
        }
    }
}
