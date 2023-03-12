package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle
 */

public class Program8_AreaTriangle {                                                            // class
    public static void main(String[] args) {                                                    //main method
        int base;                                                                               //variable declaration
        int height;
        double area;
        Scanner scan = new Scanner(System.in);                                                  //scanner object creation
        System.out.println("Enter the value of base =");
        base = scan.nextInt();
        System.out.println("Enter the value of height = ");
        height = scan.nextInt();                                                                //store value for height
        area = 0.5 * base * height;
        System.out.println("The area of a triangle" + area);
        scan.close();
    }
}
