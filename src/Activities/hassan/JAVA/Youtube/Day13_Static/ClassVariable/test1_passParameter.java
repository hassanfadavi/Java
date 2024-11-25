package Activities.hassan.JAVA.Youtube.Day13_Static.ClassVariable;

public class test1_passParameter {
    public static void main(String[] args) {

     //how to pass paramether into main methods

        args=new String[2];

        args[0]="1";
        args[1]="253";

        for(String n:args){
            System.out.println(n);
        }
        System.out.println(args.length);


    }
}
