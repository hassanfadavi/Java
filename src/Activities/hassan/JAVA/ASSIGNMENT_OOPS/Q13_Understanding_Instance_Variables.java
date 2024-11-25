package hassan.ASSIGNMENT;

public class Q13_Understanding_Instance_Variables {

    int instanceCounter=0;

    public static void main(String[] args) {

//        Question 13: Understanding Instance Variables
//
//        Step 1: Creating a Class and Main Method
//
//        Create a new Java class named InstanceVariableDemo.
//        Inside the InstanceVariableDemo class, create a main method.
//
//        Step 2: Declaring and Initializing Instance Variables
//
//        Inside the InstanceVariableDemo class but outside the main method, declare an int variable named instanceCounter and initialize it with 0.
//
//        Step 3: Modifying Instance Variables through Objects
//
//        Inside the main method, create two objects of InstanceVariableDemo.
//        Increment the instanceCounter variable for each object.
//        Print the value of instanceCounter for each object.


        Q13_Understanding_Instance_Variables obj1=new Q13_Understanding_Instance_Variables();
        obj1.instanceCounter++;

        System.out.println(obj1.instanceCounter);

        Q13_Understanding_Instance_Variables obj2=new Q13_Understanding_Instance_Variables();
        obj2.instanceCounter++;

        System.out.println(obj2.instanceCounter++);









    }
}
