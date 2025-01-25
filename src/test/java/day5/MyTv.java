package day5;

public class MyTv extends Geek{

    void turnOn() {
        System.out.println("Turning on my TV");
    }

    void turnOff() {
        System.out.println("Turning off my TV");
    }

    public static void main(String[] args) {
        MyTv myTV = new MyTv();
        myTV.turnOff();
        myTV.turnOn();
        myTV.service();
    }

}
