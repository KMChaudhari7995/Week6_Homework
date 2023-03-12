package Week6JavaPrograms;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3_StaticAndInstance {
    static int a = 50;                                                                      //static variable declaration
    int b = 40;                                                                             //Instance variable declaration

    public static void main(String[] args) {                                                //main method

        value1();                                                                               //calling static to static method
        Program3_StaticAndInstance obj3 = new Program3_StaticAndInstance();                     //object creation for instance method
        obj3.value2();                                                                           //instance method calling


    }

    public static void value1() {                                                                //static method
        System.out.println("The value of a = " + a);                                             //call variable a
        Program3_StaticAndInstance obj1 = new Program3_StaticAndInstance();                       //object creation for instance method
        System.out.println("The value of b= " + obj1.b);
    }

    public void value2() {                                                                        //instance method
        System.out.println("The value b= " + b);                                                  //Print instance variable b
        //Program3_StaticAndInstance obj2 = new Program3_StaticAndInstance();
        System.out.println("The value a= " + a);                                                //static variable calling

    }
}
