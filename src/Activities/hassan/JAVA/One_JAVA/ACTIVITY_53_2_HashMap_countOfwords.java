package Activities.hassan.JAVA.One_JAVA;

import java.util.*;


public class ACTIVITY_53_2_HashMap_countOfwords {
    public static void main(String[] args) {


        Map<String , Integer> countOfword = new HashMap<>();

        String paragraph = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of" +
                " type and scrambled it to make a type specimen book. It has survived not only five centuries, but also " +
                "the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with " +
                "the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum.";
//
//
        for ( String words : paragraph.split(" ") ) {


            if ( countOfword.containsKey(words) ) {
                countOfword.put(words, countOfword.get(words) + 1);
            } else {

                countOfword.put(words, 1);
            }
        }
        System.out.println(countOfword);

                for ( Map.Entry<String , Integer> entry : countOfword.entrySet() ) {
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }




        // Find the word with min count
        // Find the word with max count
        // key and value --> take key and value

        Map.Entry<String, Integer> firstEntry = countOfword.entrySet().iterator().next();
        String minWord = firstEntry.getKey();
        String maxWord = firstEntry.getKey();
        int minCount = firstEntry.getValue();
        int maxCount = firstEntry.getValue();

        for ( Map.Entry<String, Integer> entry : countOfword.entrySet()  ) {
            String word = entry.getKey();
            int count = entry.getValue();

            if ( count > maxCount ) {
                maxCount = count;
                maxWord = word;
            }

            if ( count < minCount ) {
                minCount = count;
                minWord = word;
            }
        }

        System.out.println("Word with min count is " + minWord + " with count of " + minCount);
        System.out.println("Word with max count is " + maxWord + " with count of " + maxCount);



        //or

//        Optional<Map.Entry<String, Integer>> minEntry = countWords.entrySet()
//                .stream()
//                .min(Map.Entry.comparingByValue());
//
//        Optional<Map.Entry<String, Integer>> maxEntry = countWords.entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue());
//
//        minEntry.ifPresent( entry ->
//                System.out.println( "Word with minimum count is: " + entry.getKey() + " count is " + entry.getValue() )
//        );
//
//        maxEntry.ifPresent( entry ->
//                System.out.println( "Word with maximum count is: " + entry.getKey() + " count is " + entry.getValue() )
//        );
//
















    }
}
