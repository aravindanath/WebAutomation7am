package day8;

public class ObjectArray1 {

    public static void main(String[] args) {


        Object[] names = new Object[5];
        names[0] = "John";
        names[1] = "Mike";
        names[2] = "Jane";
        names[3] = 'a';
        names[4] = 2344;


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}