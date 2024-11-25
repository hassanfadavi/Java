package hassan.ASSIGNMENT;

public class Q12_Understanding_Static_Variables {

    static int counter;

    public static void main(String[] args) {
//        Question 12: Understanding Static Variables
//
//        Step 1: Creating a Class and Main Method
//
//        Create a new Java class named StaticVariableDemo.
//        Inside the StaticVariableDemo class, create a main method.
//
//        Step 2: Declaring a Static Variable
//
//        Inside the StaticVariableDemo class, declare a static int variable named counter.
//
//        Step 3: Incrementing and Printing Static Variable
//
//        Inside the main method, increment the counter variable by 1.
//        Print the value of counter using System.out.println.
//                Create a new object of StaticVariableDemo and increment the counter variable again. Print the value of counter.
        counter++;
        System.out.println(counter);

        Q12_Understanding_Static_Variables obj=new Q12_Understanding_Static_Variables();
        counter++;
        System.out.println(counter);

    }
}
