package day5;

public class iPhone extends Geek implements Mobile,MobileSerivce{
    @Override
    public void battery() {
        System.out.println("3000 MAH");
    }

    @Override
    public void camera() {
        System.out.println("30mp");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.screen();
        iphone.battery();
        iphone.camera();
        iphone.battertChange();
        iphone.screenChange();
        iphone.turnOff();
        iphone.turnOn();
    }

    @Override
    public void screenChange() {
        System.out.println("screen change");
    }

    @Override
    public void battertChange() {
        System.out.println("Battery Changed");
    }

    @Override
    void turnOn() {
        System.out.println("Turning on mobile");
    }

    @Override
    void turnOff() {
        System.out.println("Turning off mobile");
    }
}
