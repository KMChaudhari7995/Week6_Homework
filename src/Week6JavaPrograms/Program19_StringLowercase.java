package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19_StringLowercase {
    public static void main(String[] args) {                                                   //main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string in Uppercase :");
        String name = scanner.nextLine();
        upperToLower(name);

        scanner.close();
    }

    public static void upperToLower(String S1){
        System.out.println("The Lowercase string is : " +S1.toLowerCase());
    }
}
