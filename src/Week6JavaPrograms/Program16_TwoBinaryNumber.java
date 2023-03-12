package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class Program16_TwoBinaryNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First value ");
        String value1 = scan.nextLine();
        System.out.println("Enter the second value");
        String value2 = scan.nextLine();
        int number1 = Integer.parseInt(value1, 2);            //using inbuilt method for convert decimal to binary
        int number2 = Integer.parseInt(value2, 2);
        int number3 = number1 + number2;
        System.out.println("The sum of two binary number is - " + Integer.toBinaryString(number3));
        scan.close();
    }

}



