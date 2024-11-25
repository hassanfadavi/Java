package Activities.hassan.JAVA.ASSIGNMENT_JAVA.A_Operators;

public class A9_Combined_Operators {
    public static void main(String[] args) {
//        9. Combined Operators:
//For a certain secret club, entry is allowed if you know the secret handshake OR the password,
// but NOT both.
// If someone knows both, they are considered a spy. Given boolean knowsHandshake = true;
// and boolean knowsPassword = true;,
// determine if the person should be allowed inside or is considered a spy.

        boolean knowsHandshake = true;
        boolean knowsPassword = true;
//
//        if(knowsHandshake ^knowsPassword ) {
//            System.out.println("person will be allowed inside");
////            if(knowsHandshake==false&&knowsPassword==false )
//        }else if(knowsHandshake==false &&knowsPassword==false ) {
//            System.out.println("person will not  be allowed inside");
//        }else System.out.println("person has been identified as a spy");
//
//
//
        //or
        if(knowsHandshake&&knowsPassword){
            System.out.println("person has been identified as a spy");
        }else if(knowsHandshake ^knowsPassword ){
            System.out.println("person will be allowed inside");
        }else System.out.println("person will not  be allowed inside");
    }


    //or
}
