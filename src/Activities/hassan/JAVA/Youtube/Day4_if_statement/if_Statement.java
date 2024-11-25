package Activities.hassan.JAVA.Youtube.Day4_if_statement;

public class if_Statement {
    public static void main(String[] args) {


        //  *************************************************
        //example

        int age = 15;

        if (age >= 20) {
            System.out.println("is eligible for vote");
        } else System.out.println("not eligible");


        //  *************************************************

        //example
        //check number is positive,negative or zero

        int num = 10;

        if (num > 0) {
            System.out.println("possitive");
        }else if (num < 0) {
                System.out.println("negative");
        } else System.out.println("zero");




        //  *************************************************

        //example
        //largest of 3 numbers
        // a=10  b=20   c=30
        int a=50,b=60,c=90;



        if(a>b&&a>c){
            System.out.println("a is largest");
        }else if(b>a&&b>c){
            System.out.println("b is largest");
        }else System.out.println("c is largest");




        //  *************************************************

        //example
        //display week names based on week number
//
//        int weekNumber=-1;
//
//        if(weekNumber>0){
//            if (weekNumber==1)
//            System.out.println("monday");
//            if (weekNumber==2)
//                System.out.println("tuesday");
//            if (weekNumber==3)
//                System.out.println("wednesday");
//            if (weekNumber==4)
//                System.out.println("th");
//            if (weekNumber==5)
//                System.out.println("fr");
//            if (weekNumber==6)
//                System.out.println("sat");
//            if (weekNumber==7)
//                System.out.println("sun");
//            else System.out.println("invalid");
//
//        }else System.out.println("invalid number");



        int weeknum=5;

        switch (weeknum){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("fr");
                break;
            case 5:
                System.out.println("fr");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;

            default:
                System.out.println("invalid");

        }



    }





    }






