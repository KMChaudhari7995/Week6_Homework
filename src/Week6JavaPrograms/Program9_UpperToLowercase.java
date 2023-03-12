package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case
 */

public class Program9_UpperToLowercase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                             //scanner for object creation
        System.out.println("Enter Upper case ");
        String uppercase = input.nextLine();
        System.out.println("String in lowercase is ");
        String lowercase = input.nextLine();
        System.out.println("String in upercase is " + uppercase.toUpperCase());                 //inbuilt method calling direct
        System.out.println("String in lowercase is  " + lowercase.toLowerCase());
        input.close();


    }
}
