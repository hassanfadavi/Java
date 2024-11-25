package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_12_AND_OPERATOR_PASSWORD {

    public static void main(String[] args) {


        //new password should be equally confirm password


        //scanner (first way)

        Scanner input=new Scanner(System.in);
        String newpassword,confirmNewPassword;

        System.out.print("please enter the new password:");
        newpassword=input.next();

        System.out.print("please reenter the  password:");
        confirmNewPassword=input.next();


        if(newpassword.equals(confirmNewPassword)){
            System.out.println("your password has been changed");
        }
        else {
            System.out.println("password doesnt mache,please reenter the password");
        }


        //OR  (if statement)2nd way
        System.out.println("*************if statement**************");
        if((newpassword.equals(confirmNewPassword))&&(confirmNewPassword.equals(newpassword))){
            System.out.println("suucessfuly has been changed");
        }
        else {
            System.out.println("not changed");
        }



       // or   (conditional statement) 3rd way

        System.out.println("*************conditional statement**************");
boolean ischanged;
        ischanged=(newpassword.equals(confirmNewPassword)) ? true:false;
if(ischanged) System.out.println("password has been changed");
else System.out.println("doesnt mache");

   //or switch statement)4th way




        System.out.println("**********switch statement*******");
       int result;

   if (newpassword.equals(confirmNewPassword)) result=1;
   else result=2;

     switch (result) {
         case 1:
             System.out.println("password has been changed");
             break;
         case 2:
             System.out.println("does'nt mache");
             break;
         default:
             System.out.println("invalid entry");
     }
//or




        int ispasswordchanged;

     ispasswordchanged=(newpassword.equals(confirmNewPassword))? 1:0;
     switch (ispasswordchanged){
         case 1:
             System.out.println("has been changed");
             break;
         case 0:
             System.out.println("does nt match");
             break;
         default:
             System.out.println("invalid");
     }





    }
    }
