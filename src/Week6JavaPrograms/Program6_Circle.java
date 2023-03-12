package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Program6_Circle {                                                                                //main method
    public static void main(String[] args) {
        double radius;
        double area;                                                                                            //variable declaration
        Scanner scanner = new Scanner(System.in);                                                              //scanner object create
        System.out.println("Enter the radius of the circle : ");
        radius = scanner.nextDouble();                                                                          // store value in radius
        area = Math.PI * radius * radius;                                                                            //store value in area
        System.out.println("Area of circle is A= PI*radius*radius = " + area);
        scanner.close();

    }


}
