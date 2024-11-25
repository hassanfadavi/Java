package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_31_FOR_LOOP {
    public static void main(String[] args) {

// /*
//    *
//    * 1 * 2 = 2
//    * 2 * 2 = 4
//    * 3 * 2 = 6
//    * 4 * 2 = 8
//    *
//    * */


















        int stop=10;
        int number=2;

        for(int start=1;start<=stop;start++){
//            System.out.println(  +start+" * "+number+" ="+(start*number));
        }

        //or  scanner


        var input=new Scanner(System.in);

        int start,end,desiredNumber;

        System.out.print("which number would you like to print: ");
        desiredNumber=input.nextInt();

        System.out.print("from where do you need me to start: ");
        start=input.nextInt();

        System.out.print("when do you want  to stop:");
        end=input.nextInt();

        for(int i=start;i<=end;i++){
            System.out.println( i +" * "+desiredNumber+" ="+(i*desiredNumber));
        };

       // ex:30


        for(int num=10;num>=1;num--){
            System.out.println(num);
        };










    }
}
