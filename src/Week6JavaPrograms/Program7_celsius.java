package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */

public class Program7_celsius {

    public static void main(String[] args) {
        double F;                                                                           //variable declaration
        double celsius;                                                                     //variable declaration
        Scanner scan = new Scanner(System.in);                                              //object creation for scanner
        System.out.println("Enter the value in degree Fahrenheit :");
        F = scan.nextDouble();
        celsius = ((F - 32) * 5) / 9;
        scan.close();
        System.out.println("Convert the value to degree celsius  = " + celsius);
    }

}
