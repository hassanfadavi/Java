package Activities.hassan.JAVA.One_JAVA;

import java.util.*;

public class ACTIVITY_52_HashMap {
    public static void main(String[] args) {


        //print the count of T


//        String message = "Welcome to Tekschool";


//        int count = 0;
//
//        for (int i = 0; i <= message.length() - 1; i++) {
//
//            if (message.charAt(i) == 'T') {
//
//                count++;
//
//            }
//
//        }
//        System.out.println(count);


        //ex


//
//        String message = "Welcome to Tekschool";
//
//        char[]character=message.toCharArray();
//
//        for(char singleCharacter:character){
//
//            System.out.println(singleCharacter);
//
//        }




        Map<Integer, String> StudentInformation = new HashMap<>();
        /*
         * Id, Name
         * 1 - Bob
         * 2 - Jack
         * */

        StudentInformation.put(1, "Bob");
        StudentInformation.put(2, "Jack");
        StudentInformation.put(3, "Jasmine");

        System.out.println(StudentInformation);
        System.out.println(StudentInformation.get(1));

        for (Map.Entry<Integer, String> entry : StudentInformation.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        //or
        for (Map.Entry<Integer, String> entry : StudentInformation.entrySet()) {
            System.out.println(entry );
        }


        //or




        System.out.println(StudentInformation.containsValue("Bob"));

        System.out.println(StudentInformation.containsKey(3));


        System.out.println(StudentInformation.keySet());

        System.out.println(StudentInformation.values());

        for(int key:StudentInformation.keySet()){
            System.out.print(key+" , ");
        }

        System.out.println();
        System.out.println(StudentInformation.entrySet());

        System.out.println(StudentInformation.size());

        System.out.println(StudentInformation.isEmpty());


        StudentInformation.clear();
        System.out.println(StudentInformation);













    }
}












