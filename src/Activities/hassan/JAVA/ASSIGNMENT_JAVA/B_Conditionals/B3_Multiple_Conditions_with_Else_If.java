package Activities.hassan.JAVA.ASSIGNMENT_JAVA.B_Conditionals;

public class B3_Multiple_Conditions_with_Else_If {
    public static void main(String[] args) {

//        3. Multiple Conditions with Else-If:
//For a grading system, given an integer variable marks, determine and display the grade:
//
//    Above 90: "A"
//    80 to 89: "B"
//    70 to 79: "C"
//    60 to 69: "D"
//    Below 60: "Fail"

        int score=70;
//       if(score>=90){
//           System.out.println("Grade A");
//       }else if(score>=80){
//            System.out.println("Grade B");
//        }else if (score>=70){
//            System.out.println("Grade C");
//        }
//       else System.out.println("Fail");




        //or

int index;
        if(score>=90){
            index=1;
        }else if(score>=80){
            index=2;
        }else if(score>=70){
            index=3;
        }else
            index=4;


       switch (index){
           case 1:
               System.out.println("Grade A");
               break;
           case 2:
               System.out.println("Grade B");
               break;
           case 3:
               System.out.println("Grade C");
               break;
           case 4:
               System.out.println("Fail");
           case 5:
           default:
               break;


       }


    }




}
