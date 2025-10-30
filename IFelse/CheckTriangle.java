package IFelse;

public class CheckTriangle {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        if (a == b) {
            if (a == c) {
                System.out.println("Equi");
            } else {
                System.out.println("Iso");
            }
        } else if (a == c) {
            System.out.println("iso");
        } else if (b == c) {
            System.out.println("iso");
        } else {
            System.out.println("scalene");
        }
    }
}
