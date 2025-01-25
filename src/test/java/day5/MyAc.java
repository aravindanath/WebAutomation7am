package day5;

public class MyAc extends  Geek{
    void turnOn() {
        System.out.println("Turning on my AC");
    }

    void turnOff() {
        System.out.println("Turning off my AC");
    }

    public static void main(String[] args) {
        MyAc myAc = new MyAc();
        myAc.turnOn();
        myAc.turnOff();
        myAc.service();
    }
}
