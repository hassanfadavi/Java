package Activities.hassan.JAVA.ASSIGNMENT_JAVA.E_Methods;

public class E1_Basic_Method_Creation {
    public static void main(String[] args) {
//      1. Basic Method Creation:
//Write a method named greet that takes a string
// parameter name and returns a greeting message, such as "Hello, John!".

        great("John");

        //or
        System.out.println("hassan");


    }


    public static void great(String firstName){

        System.out.println("hello "+firstName);

    }

    //or

    public static String greats(String Name){
        return Name;
    }

}
