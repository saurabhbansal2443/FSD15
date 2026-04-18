package OOPS;

class Product { // Class is a blueprint (Custom data structure)

    String title;
    int price;
    boolean availableForSale;

    Product() {
        System.out.println("consturuvtor called ");
    }

    // Constructor overloading
    Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // polymorphism --> oneThing many forms (Compile Time polymorphism)

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Product bag = new Product();
        bag.title = "Sky bag ";
        bag.price = 123;

        Product laptop = new Product("Macbook", 123456576);

        System.out.println(bag.title);
        System.out.println(laptop.title);

        System.out.println(laptop.add(1, 2));
        System.out.println(laptop.add(1, 2, 3));

    }
}
