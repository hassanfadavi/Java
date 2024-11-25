package hassan.ASSIGNMENT;

public class Q7_Casting {
    public static void main(String[] args) {

//
//        Question 7: Type Casting in Java
//
//        Step 1: Creating a Class and Main Method
//
//        Create a new Java class named TypeCastingDemo.
//        Inside the TypeCastingDemo class, create a main method.
//
//        Step 2: Declaring and Initializing Variables
//
//        Inside the main method, declare a double variable named doubleVar and initialize it with the value 50.5.
//
//                Step 3: Implicit and Explicit Casting
//
//        Perform implicit casting by declaring an int variable named intVar and assigning it the value of doubleVar.
//                Perform explicit casting by declaring a short variable named shortVar and explicitly casting doubleVar to short.
//
//                Step 4: Printing the Results of Casting
//
//        Print the values of doubleVar, intVar, and shortVar using System.out.println.


       double doubleVar=50.5;
       int intVar=(int)doubleVar;


       short shortVar=(short) doubleVar;

        System.out.println(intVar);
        System.out.println(shortVar);









    }
}
