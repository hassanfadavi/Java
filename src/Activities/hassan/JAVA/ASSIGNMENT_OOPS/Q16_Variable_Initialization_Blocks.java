package hassan.ASSIGNMENT;

public class Q16_Variable_Initialization_Blocks {

    static int staticVar;
    int instanceVar;

    {
        staticVar=50;
    }

  {
       instanceVar=25;
    }





    public static void main(String[] args) {

//        Question 16: Variable Initialization Blocks
//
//        Step 1: Creating a Class and Main Method
//
//        Create a new Java class named InitializationBlockDemo.
//        Inside the InitializationBlockDemo class, create a main method.
//
//        Step 2: Declaring Variables and Initialization Blocks
//
//        Inside the InitializationBlockDemo class,
//        declare a static int variable named staticVar and an instance int variable named instanceVar.
//        Create a static initialization block to set the value of staticVar to 50.
//        Create an instance initialization block to set the value of instanceVar to 25.
//
//        Step 3: Printing Initialized Variables
//
//        Inside the main method, print the value of staticVar.
//        Create an object of InitializationBlockDemo and print the value of instanceVar.



        Q16_Variable_Initialization_Blocks obj=new Q16_Variable_Initialization_Blocks();

        System.out.println(staticVar+" and "+ obj.instanceVar);




    }
}
