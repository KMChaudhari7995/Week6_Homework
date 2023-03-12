package Week6JavaPrograms;

/**
 * write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class program4_TwoStaticTwoInstance {

    int instanceVariable1 = 50; // Declare instance variable
    int instanceVariable2 = 60; //Declare instance variable
    static int staticVariable1 = 70;    //Declare static variable
    static int staticVariable2 = 80;    //Declare static variable

    public static void main(String[] args) {
        staticMethod();                                                                                 //static method calling
        program4_TwoStaticTwoInstance obj3 = new program4_TwoStaticTwoInstance();                        //object created to call instance method
        obj3.instanceMethod();                                                                          //method calling


    }

    public static void staticMethod() {                                                                  //static method
        System.out.println("Print the static value " + staticVariable1);                                 //print static value
        System.out.println("Print the static value " + staticVariable2);
        program4_TwoStaticTwoInstance obj1 = new program4_TwoStaticTwoInstance();                        //object created to call instance variable
        int value = obj1.instanceVariable1;                                                              //assign value for instance variable
        System.out.println("Print the instance value " + value);                                         //print instance variable
        int result = obj1.instanceVariable2;
        System.out.println("Print the instance value " + result);

    }

    public void instanceMethod() {                                                                       //instance method
        program4_TwoStaticTwoInstance obj2 = new program4_TwoStaticTwoInstance();                        //object created to call static variable
        System.out.println("Print the static value is = " + obj2.staticVariable1);                      //print static variable
        System.out.println("Print the static value is = " + obj2.staticVariable2);
        System.out.println("Print the static value " + instanceVariable1);                              //print instance variable
        System.out.println("Print the static value " + instanceVariable2);


    }

}
