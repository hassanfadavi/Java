package Activities.hassan.JAVA.ASSIGNMENT_JAVA.C_Loop;

public class C2_While_Loop {
    public static void main(String[] args) {

//        2. While Loop:
//You have a jar of cookies.
// Initially, the jar contains 20 cookies. Every day you eat 2 cookies from the jar.
// Using a while loop,
// determine how many days it will take for the cookies to run out.

       int count=0;
        int i=2;

        while (i<=20){
            System.out.println(i);
            i+=2;
            count++;
        }
        System.out.println("count:" +count);




    }
}
