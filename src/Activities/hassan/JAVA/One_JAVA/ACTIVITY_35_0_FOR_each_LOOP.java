package Activities.hassan.JAVA.One_JAVA;

public class ACTIVITY_35_0_FOR_each_LOOP {
    public static void main(String[] args) {

        String message = "Java is easy!";

        // Print the characters of the String message!
        for ( int index = 0; index < message.length(); index++ ) {
            System.out.println( message.charAt(index) );
        }

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        // Or using forEach loop
        // toCharArray() --> String --> an array of characters
//        char[] characters = message.toCharArray();
//
//        for ( char character : characters ) {
//            System.out.println(character);
//        }

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        // for ( char character : message.toCharArray() ) System.out.println( character );

        // Or if you don't want to see the spaces
        for ( char character : message.replace(" ", "").toCharArray() ) System.out.println( character );

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );
    }
}
