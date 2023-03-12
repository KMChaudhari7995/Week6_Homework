package Week6JavaPrograms;

/**
 * . Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1_InstanceVariablesAndMethods {

    int a = 10; //instance variable
    int b = 20; // instance variable

    public static void main(String[] args) {                                                                //main method
        Program1_InstanceVariablesAndMethods obj1 = new Program1_InstanceVariablesAndMethods();           //object created for instance method
        obj1.addition();                                                                                    //method calling
        //System.out.println();
    }

    public void addition() {                                                            //instance method

        System.out.println(a);                                                          //instance variable
        System.out.println(b);                                                          //instance variable

    }

}
