package IFelse;

import java.util.*;

public class GradeOfSteel {
    public static void main(String[] args) {
        // A certain grade of steel is graded according to the following conditions
        // Hardness must be greater than 50
        // Carbon content must be less than 0.7
        // Tensile strength must be greater than 5600
        // The grades are as follows:
        // The grade is 10 if all three conditions are met
        // The grade is 9 if conditions (i) and (ii) are met
        // The grade is 8 if conditions (ii) and (iii) are met
        // The grade is 7 if conditions (i) and (iii) are met
        // The grade is 6 if only one condition is met
        // The grade is 5 if none of the conditions are met
        // Write a program, which will require the user to give values of hardness,
        // carbon content and tensile strength of the steel under consideration and
        // output the grade of the steel

        Scanner sc = new Scanner(System.in);

        int hardness = sc.nextInt();
        double carbon = sc.nextDouble();
        int tensileStrength = sc.nextInt();

        // if (hardness > 50 && carbon < 0.7 && tensileStrength > 5600) {
        // System.out.println("Grade 10 ");
        // } else if (hardness > 50 && carbon < 0.7) {
        // System.out.println("Grade 9 ");
        // } else if (tensileStrength > 5600 && carbon < 0.7) {
        // System.out.println("Grade 8 ");
        // } else if (hardness > 50 && tensileStrength > 5600) {
        // System.out.println("Grade 7 ");
        // } else if (hardness > 50 || carbon < 0.7 || tensileStrength > 5600) {
        // System.out.println("Grade 6 ");
        // } else {
        // System.out.println("Grade 5 ");
        // }

        // Best way to do these type of problems


        boolean condition1 = hardness > 50;
        boolean condition2 = carbon < 0.7;
        boolean condition3 = tensileStrength > 5600;

        if (condition1 && condition2 && condition3) {
            System.out.println("Grade 10 ");
        } else if (condition1 && condition2) {
            System.out.println("Grade 9 ");
        } else if (condition3 && condition2) {
            System.out.println("Grade 8 ");
        } else if (condition1 && condition3) {
            System.out.println("Grade 7 ");
        } else if (condition1 || condition2 || condition3) {
            System.out.println("Grade 6 ");
        } else {
            System.out.println("Grade 5 ");
        }

    }
}
