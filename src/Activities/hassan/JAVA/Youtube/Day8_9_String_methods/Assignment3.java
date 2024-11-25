package Activities.hassan.JAVA.Youtube.Day8_9_String_methods;

public class Assignment3 {
    public static void main(String[] args) {


        //remove junk or special character in String
        //  txt="We&%$#__come012";
        //output: welcome

        String txt="We&%l$#__come012";

        System.out.println(txt.replaceAll("[^a-zA-Z0-9]",""));







    }
}
