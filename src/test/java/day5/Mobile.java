package day5;

public interface Mobile {

    // Abstract method
    void battery();
    void camera();

    default void screen(){
        System.out.println("Screen");
    }
}
