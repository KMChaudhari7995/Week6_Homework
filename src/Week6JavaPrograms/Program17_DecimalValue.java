package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17_DecimalValue {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Decimal value  ");
        int decimalNo = scan.nextInt();                                             //value storage for decimal
        String binaryNo = Integer.toBinaryString(decimalNo);                        //inbuilt method
        System.out.println("The binary value for decimal number is: " + binaryNo);
        scan.close();
    }
}
