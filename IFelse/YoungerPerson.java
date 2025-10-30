package IFelse;

public class YoungerPerson {
    public static void main(String[] args) {
        // If the ages of Ram, Shyam and Ajay are input through the keyboard,
        // write a program to determine the youngest of the three

        int ram = 10;
        int shyam = 20;
        int ajay = 15;

        // if (ram < shyam) {
        // if (ram < ajay) {
        // System.out.println("Ram");
        // } else {
        // System.out.println("Ajay");
        // }
        // } else if (shyam < ajay) {
        // System.out.println("Shyam");
        // } else {
        // System.out.println("Ajay");
        // }

        if (ram < shyam && ram < ajay) {
            System.out.println("ram");
        } else if (shyam < ram && shyam < ajay) {
            System.out.println("shyam");
        } else {
            System.out.println(("Ajay"));
        }
    }
}
