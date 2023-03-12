package Week6JavaPrograms;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class Program15_SwapTwoVariable {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                              //scanner
        System.out.println("Enter value of a " );
        int a = scan.nextInt();
        System.out.println("Enter value of b " );
        int b = scan.nextInt();
        Program15_SwapTwoVariable obj = new Program15_SwapTwoVariable();  // create object
        obj.swapnumber(a,b);
        scan.close();

    }
public void swapnumber(int a,int b){                                          //instance method
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("Enter the value of a " + a);
    System.out.println("Enter the value of b " + b);
}
}


