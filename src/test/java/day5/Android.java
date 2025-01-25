package day5;

public class Android implements Mobile{
    public void battery() {
        System.out.println("5000mah");
    }

    public void camera() {
        System.out.println("50MP");
    }

    public static void main(String[] args) {
        Android android = new Android();
        android.screen();
        android.battery();
        android.camera();
    }
}
