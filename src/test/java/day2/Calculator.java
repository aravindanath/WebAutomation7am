package day2;

public class Calculator {




    public static void main(String[] args) {
        // ClassName refVar = new ClassName();
        // Class object
      Calculator calculator =  new Calculator();
      calculator.addNumber(112,22);
      calculator.addNumber(12312,1231);
      calculator.addNumber(234.00f,23232.22f);
     int x = calculator.addNumber(1,24,45);
     System.out.println("Sum of 3 numbers is: " + x/2+3);

     int y = x+1234/2*3;
     System.out.println("Sum of 3 numbers is: " + y);


    }

    //AccessModifier returnType methodName(param){}
    public void addNumber(int a, int b){
        int sum = a + b; // Local variable
        System.out.println("Sum of a and b is: " + sum);
    }
    // Method Overloading

    public void addNumber(float aa, float bb){
        float sum = aa + bb;
        System.out.println("Sum of a and b is: " + sum);
    }

    public int addNumber(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }



}
