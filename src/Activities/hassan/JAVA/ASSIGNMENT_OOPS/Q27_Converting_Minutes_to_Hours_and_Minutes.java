package hassan.ASSIGNMENT;

public class Q27_Converting_Minutes_to_Hours_and_Minutes {
    public static void main(String[] args) {

//        Question 27: Converting Minutes to Hours and Minutes
//
//    Create an int variable named totalMinutes and assign it the value 135.
//    Calculate the number of hours and the remaining minutes.
//    Print the result in the format X hours and Y minutes.

        int totalMinutes=135;
        int hours=totalMinutes/60;
        int mins=totalMinutes%60;


        System.out.println(hours+" hours   \n"+mins+" minutes");


    }
}
