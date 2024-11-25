package Activities.hassan.JAVA.Youtube.Day8_9_String_methods;

public class Assignment1 {
    public static void main(String[] args) {
        //reverse String


        String message = "welcome";

//        for(int i=message.length()-1;i>=0 ;i--) {
//            System.out.print( message.charAt(i) );
//        }



        //or

//        char[] a = message.toCharArray();   //convert to array
//
//        for (int i = message.length() - 1; i >= 0; i--) {
//            System.out.print(a[i]);
//        }

        //or
        StringBuffer b=new StringBuffer(message);
        System.out.println(b.reverse());

        //or
        StringBuilder u=new StringBuilder(message);
        System.out.println(u.reverse());




        String n=new String("hassan");
        n.concat("hi");

        System.out.println(n);

    }
}
