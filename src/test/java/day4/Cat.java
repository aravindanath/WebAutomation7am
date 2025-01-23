package day4;

public class Cat  extends Animal{

    public void meoew(){
        System.out.println("Meoew");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.meoew();
        myCat.fur();
        myCat.tail();
        myCat.vaccination();
    }
}
