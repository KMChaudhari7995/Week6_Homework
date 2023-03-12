package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */

public class Program13_AverageNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                                      //scanner object for enter the value
        System.out.println("Enter the first value");
        int number1 = scan.nextInt();
        System.out.println("Enter the second value");
        int number2 = scan.nextInt();
        System.out.println("Enter the three value");
        int number3 = scan.nextInt();
        //  double average = (number1+number2+number3)/3;
        //System.out.println("Average value of three number is ="+average);
        Program13_AverageNumber input = new Program13_AverageNumber();       // create object
        input.average(number1, number2, number3);                            //instance method calling using
        scan.close();


    }

    //static method
  /*  public static void average(int number1,int number2,int number3)
    {
        double average  =(number1+number2+number3) / 3;
        System.out.println("Average"+average);
    }
*/
    //instance method
    public void average(int number1, int number2, int number3) {              //instance method using parameters
        double average = (number1 + number2 + number3) / 3;
        System.out.println("Average number" + average);
    }

}
