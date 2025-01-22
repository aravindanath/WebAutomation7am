package day3;

public class AccessModifiers {


    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
    }

    public void publicMethod(){
        System.out.println("This is public method");
    }

    private void privateMethod(){
        System.out.println("This is private method");
    }

    protected void protectedMethod(){
        System.out.println("This is protected method");
    }
     void defaultMethod() {
         System.out.println("This is default method");
     }

}
