package day4;

// sub-class / Child class / derived clas --> Super class / Parent Class
public class Dog  extends Animal{

    public void bark(){
        System.out.println("Barking");

    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.fur();
        dog.tail();
        dog.bark();
        dog.vaccination();
    }
}
