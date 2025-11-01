package IFelse;

public class PerimeterOrArea {
    public static void main(String[] args) {
        // You are given two integers that are the length and breadth of the rectangle.
        // Check whether the area or perimeter is greater

        int l = 10;
        int b = 7;

        int area = l * b;
        int permiter = 2 * (l + b);

        if (area > permiter) {
            System.out.println("Area is Greater ");
        } else {
            System.out.println("Permiter is Greater ");
        }

    }
}
