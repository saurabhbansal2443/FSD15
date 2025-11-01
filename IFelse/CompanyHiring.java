package IFelse;

import java.util.*;

public class CompanyHiring {
    public static void main(String[] args) {
        // A company hires a person if
        // If person is married
        // if person is unmarried, male and above 30 years of age
        // if person is unmarried , female and above 25 years of age

        Scanner sc = new Scanner(System.in);

        char status = sc.next().charAt(0); // m , u
        char gender = sc.next().charAt(0); // m , f
        int age = sc.nextInt();

        if (status == 'm' || status == 'M') {
            System.out.println("Hired");
        } else if ((gender == 'm' || gender == 'M') && age > 30) {
            System.out.println("Hired");
        } else if ((gender == 'f' || gender == 'F') && age > 25) {
            System.out.println("Hired");
        } else {
            System.out.println("Not Hired");
        }

    }
}
