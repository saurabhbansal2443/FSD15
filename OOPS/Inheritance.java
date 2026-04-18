package OOPS;

abstract class Animal {

    String name;

    Animal() {
        System.out.println("animal constructor called ");
    }

    Animal(String name) {
        System.out.println("animal  constructor 2called ");
        this.name = name;
    }

    abstract void sound();

    void movement() {
        System.out.println("Walk");
    }

    void eat() {
        System.out.println("khana");
    }
}

// Single Level inheritance
class Dog extends Animal {
    // Method overriding (Run time polymorphism)

    Dog() {
        System.out.println("dog constructor called ");
    }

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }

    void smell() {
        System.out.println("Medium");
    }
}

// multilevel inhertinatnce
class Labra extends Dog {
    Labra(String name) {
        super(name);
    }

    Labra() {
        System.out.println("labra constructor called ");
    }

    void speed() {
        System.out.println("Fast");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.sound();

        Labra l1 = new Labra("fudfeuyd");

        System.out.println(l1.name);

        // l1.movement();
        // l1.sound();
    }
}
