package Week6JavaPrograms;

import java.util.Scanner;

/**
 * . Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Program18_Mathematics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First value  ");                  //print statement
        int firstNumber= scan.nextInt();
        System.out.println("Enter the second value ");
        int secondNumber =scan.nextInt();
        addition(firstNumber,secondNumber);
        subtraction(firstNumber,secondNumber);
        Program18_Mathematics value = new Program18_Mathematics();      //object call
        value.multiplication(firstNumber,secondNumber);                 //instance  method calling
        value.division(firstNumber,secondNumber);                       //instance method call
        value.mod(firstNumber,secondNumber);

        scan.close();

    }
public static void addition(int firstNumber ,int secondNumber){             //static method
       int thirdNumber = firstNumber+secondNumber;
    System.out.println("125 + 24 =  "+thirdNumber);
    }

    public static void subtraction(int firstNumber, int secondNumber){         //static method
        int thirdNumber =firstNumber-secondNumber;
        System.out.println("125 - 24 =  "+thirdNumber);

    }
    public void multiplication (int firstNumber, int secondNumber){         //instance method
        int thirdNumber = firstNumber*secondNumber;
        System.out.println("125 * 24 =  " +thirdNumber);
    }
    public void division(int firstNumber,int secondNumber){
        int thirdNumber = firstNumber/ secondNumber;
        System.out.println("125 / 24 =  " +thirdNumber);

    }
    public void mod(int firstNumber,int secondNumber){
        int thirdNumber = firstNumber % secondNumber;
        System.out.println("125 % 24 =  " +thirdNumber);

    }
}
