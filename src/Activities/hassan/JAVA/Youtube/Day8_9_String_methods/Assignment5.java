package Activities.hassan.JAVA.Youtube.Day8_9_String_methods;

public class Assignment5 {
    public static void main(String[] args) {

        //count occurrences of 'a' character in a string
        //abcabcbabcbabc


        String txt="ab a  vfdgbrtas aa  ";


        String removespace=  txt.replaceAll("\\s","");
       int removespaceLength= removespace.length();


        String remove_a_length= removespace.replaceAll("a","");
       int removea=remove_a_length.length();


        System.out.println(removespaceLength-removea);








//        int count=0;
//
//        for(int i=0;i<=txt.length()-1;i++){
//
//            txt.charAt(i);
//            count++;
//            System.out.println(txt.charAt(i)+":"+count);
//        }










    }
}
