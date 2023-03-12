package Week6JavaPrograms;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Program5_Calculator {
    public static void main(String[] args) {

        Program5_Calculator obj = new Program5_Calculator();              //object create for instance method calling
        addition(20, 10);                                           //assign value while calling static method
        subtraction(20, 10);
        obj.division(100, 33);                                      //assign value while calling instance method
        obj.multiplication(20, 10);


    }

    public static void addition(int a, int b) {                  //static method with parameters
        int c = a + b;                                           //assign value to c
        System.out.println("Addition of a+b is " + c);
        //return c;
    }

    public static void subtraction(int a, int b) {                  //static method with parameters
        int c = a - b;                                              //assign value to c
        System.out.println("subtraction of a-b is " + c);
        //  return c;
    }

    public void division(int a, int b) {                            //instance value
        int c = a / b;
        System.out.println("Division of a/b is " + c);
        //return c;
    }

    public void multiplication(int a, int b) {                //instance value
        int c = a * b;
        System.out.println("multiplication of a*b is " + c);
        //return c;
    }
}
