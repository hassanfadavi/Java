package Activities.hassan.JAVA.ASSIGNMENT_JAVA.A_Operators;

public class A8_NOT {
    public static void main(String[] args) {
//        8. NOT (!):
//You are building an application where certain
// features are available only to non-admin users.
// Given boolean isAdmin = true;, write a condition to check if
// the current user is NOT an admin and hence can access those features.

        boolean isAdmin = false;

        if(!isAdmin){
            System.out.println("user have access those features");
        }else System.out.println(" admin not have access those features");



    }
}
