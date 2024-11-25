package Activities.hassan.JAVA.Two_OOPS.obj_11_mutable;

public class ReversingString {
    public static void main(String[] args) {

        String message="Hello World";
        String reversedString="";

        for(int index=message.length()-1;index>=0;index--){
           reversedString=reversedString+ message.charAt(index);
           //or
//            reversedString+=message.charAt(index);

        }
        System.out.println(reversedString);



        System.out.println(reversString(message));
    }

    //or create a method

    public static String reversString(String str){
        String reversedString="";
        for(int index=str.length()-1;index>=0;index--){
            reversedString+=str.charAt(index);
        }
       return reversedString;



    }
}
