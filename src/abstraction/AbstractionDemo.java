package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.leg();

        Cat cat=new Cat();
        cat.sound();
        cat.leg();

    }
}
abstract class Animal {
    abstract void sound();

    void leg() {
        System.out.println("4 leg");
    }
}
class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Bhooo Bhoo");
    }
}
class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("Mauu....");
    }
}