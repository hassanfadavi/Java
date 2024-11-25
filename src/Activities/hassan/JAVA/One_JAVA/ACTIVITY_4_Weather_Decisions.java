package Activities.hassan.JAVA.One_JAVA;

public class ACTIVITY_4_Weather_Decisions {

    public static void main(String[] args) {

           /*
    Question 1: Weather Decisions

    1. Declare three boolean variables: isRaining, hasUmbrella, and isWindy.
    Assign any values of your choice to these variables.
    Write a condition to determine if you should go out or stay indoors.
     What is the result based on your values?
    Using the same variables, determine if you should take an umbrella when going out. Which conditions
    influenced your decision?
    Finally, decide if you should wear a windbreaker based on the given conditions.
*/


        //??????????????


        boolean isRaining=false;
        boolean hasUmberella=true;
        boolean isWindy=true;


        if(isRaining ) {
            if (hasUmberella) {
                System.out.println("you should go out");
            } else System.out.println(" stay indoors");
            if (isWindy) {
                System.out.println("wear a windbreaker");
            }
        }
        else System.out.println("you should go out,because is not rainy");


        //or


//
//var input=new Scanner(System.in);
//
//       boolean isRaining;
//        boolean hasUmberella;
//        boolean isWindy;
//
//        System.out.print("is it raining: ");
//        isRaining=input.nextBoolean();
//
//        System.out.print("has umberellas: ");
//        hasUmberella=input.nextBoolean();
//
//        System.out.print("is it windy: ");
//        isWindy=input.nextBoolean();
//
//
//        if(isRaining ) {
//            if (hasUmberella) {
//                System.out.println("you should go out");
//            } else System.out.println(" stay indoors");
//            if (isWindy) {
//                System.out.println("wear a windbreaker");
//            }
//        }
//        else System.out.println("you should go out,because is not rainy");
//
//



    }
}



