package Activities.hassan.JAVA.Youtube.Day8_9_String_methods;



public class Assignment6 {
    public static void main(String[] args) {

        //count word in String
        //txt="welcome to java selenium";


//        String txt="welcome to java selenium";

//        String sp[]=txt.split(" ");
//        int count=0;
//
//
//        for(int i=0;i<=sp.length-1;i++){
//             count++;
//
//        }
//        System.out.println(count);

        //or

        String txt="welcome to java selenium";

        int count=1;
        for(int i=0;i<=txt.length()-1;i++){

            if(  ( txt.charAt(i)==' ' )  &&( txt.charAt(i+1)!=' ' ) ){

              count++;

            }


        }
        System.out.println(count);










    }
}
