package Activities.hassan.JAVA.Youtube.Day6and7_Arrays;
 import  java.util.Scanner;
 import  java.util.Arrays;

public class Scanners {
    public static void main(String[] args) {


        //1D-Scanner

        var input=new  Scanner(System.in);

        int num[]=new int[3];

        for(int i=0;i<=num.length-1;i++){

                System.out.print("enter number "+(i+1)+":");
                num[i] = input.nextInt();

            }
        System.out.println(Arrays.toString(num));









    }

}
