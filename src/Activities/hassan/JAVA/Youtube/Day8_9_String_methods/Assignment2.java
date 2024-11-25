package Activities.hassan.JAVA.Youtube.Day8_9_String_methods;

public class Assignment2 {
    public static void main(String[] args) {

//check String is palindrome or not

//        String s="MADAM"
//        output:palindrome
//
//        String s="welcome";
//        output=not palindrome

        String s="MADAM";
       String revere="";


        for(int i=s.length()-1;i>=0;i--) {
            revere= revere+ s.charAt(i);  //modify  turn to String
        }

        if(revere.equals(s)){
            System.out.println("palindrome");
        }else System.out.println("not palindrome");


          //or  scanner
//        var input=new Scanner(System.in);
//        String s;
//
//        System.out.print("enter the word:");
//        s=input.next();
//
//        String revere="";
//
//
//        for(int i=s.length()-1;i>=0;i--) {
//
//            revere= revere+ s.charAt(i);  //modify  turn to String
//        }
//
//        if(revere.equals(s)){
//            System.out.println("palindrome");
//        }else System.out.println("not palindrome");






    }
        }
