package Activities.hassan.JAVA.One_JAVA;

import java.util.Map;
import java.util.TreeMap;

public class ACTIVITY_53_1_1_TreeMap_countCharacter {
    public static void main(String[] args) {


        //GIVE ME THE COUNT OF ALL CHARACHTER



        String message = "Welcome to java class!$#$";
        Map<Character, Integer> sortedCharacters = new TreeMap<>();
        /*
         * W - 1
         * e - 2
         * */
//
//        System.out.println(message.replaceAll("[^A-Za-z]",""));
//        System.out.println(message.replaceAll("[^A-Z]",""));
//        System.out.println(message.replaceAll("[^a-z]",""));
//        System.out.println(message.replaceAll("[^0-9]",""));
//        System.out.println(message.replaceAll("[^A-Za-z0-9]",""));

        for ( char character : message.replaceAll("[^a-z]", "").toCharArray() ) {
            // if the character exists in my map, get the current count, and add 1 to it
            if ( sortedCharacters.containsKey(character) ) {
                sortedCharacters.put(character, sortedCharacters.get(character) + 1);
            } else {
                // if not, add the character and give it the count of 1
                sortedCharacters.put(character, 1);
            }
        }
        System.out.println( sortedCharacters );

        for ( Map.Entry<Character, Integer> entry : sortedCharacters.entrySet() ) {
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }

//        countOfCharacters.forEach( ( k, v ) -> System.out.println( k + " - " + v ));
//
//



    }
}
