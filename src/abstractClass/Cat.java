package abstractClass;

abstract public class Cat extends Animal{

    void walk() {
        System.out.println("Cat is walking...");
    }


    void eat() {
        System.out.println("Cat is eating...");
    }

    abstract boolean wildCat();
}
