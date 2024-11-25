package Activities.hassan.JAVA.ASSIGNMENT_JAVA.A_Operators;

public class A5_Logical_Operators {
    public static void main(String[] args) {

//5. Logical Operators:
//Imagine you're coding a security system.
// The door will only open if isPasswordCorrect is true AND isAdmin is true.
// Write a code snippet to check these conditions using the AND (&&) operator.


        boolean isPasswordCorrect=true;
        boolean isAdmin=true;

        if(isPasswordCorrect==true&&isAdmin==true){
            System.out.println("security is Autorised");
        }else System.out.println("not approved");




        //or

//        var input=new Scanner(System.in);
//        int password;
//        boolean isAddmin;
//        int confirmPassword=1234;
//
//        System.out.print("enter your password: ");
//        password=input.nextInt();
//
//        System.out.print("Are you Addmin: ");
//        System.out.println("select option"+ "\n1:true  ,  2:false");
//
//        isAddmin=input.hasNext();
//
//        if(password==confirmPassword&&isAddmin==true){
//
//            System.out.println("security is Autorised");
//        }else System.out.println("not approved");






    }
}
