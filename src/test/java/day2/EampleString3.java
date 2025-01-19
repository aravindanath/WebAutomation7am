package day2;

public class EampleString3 {
    public static void main(String[] args) {

        String firstName =  " John is from Boston ";

        System.out.println(firstName.substring(7));
        System.out.println(firstName.substring(7,14));

//        char[] x = firstName.toCharArray(); //'j'o'h'n
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//        }

        System.out.println(firstName.length());
        System.out.println(firstName.trim().length());
    }
}
