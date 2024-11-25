package Activities.hassan.JAVA.Youtube.Day8_9_String_methods;

public class String_method {
    public static void main(String[] args) {


        //length
        String s="welcome";
        System.out.println(s.length() );

        String []names={"hassan","Reihane"};
        System.out.println(names.length);
        System.out.println(names[0].length());




        //concat
        String s1="welcome";
        String s2="to Java ";
        String s3=" automation";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2).concat(s3));


        //trim
        System.out.println(s2.trim());   //trim before or after

        //charAt();
        String s4="automation";
        System.out.println(s4.charAt(6));


        String []name={"hassan","Reihane"};
        System.out.println(name[0].charAt(0));


        //contains
        System.out.println(s4.contains("au"));

        //replace
        String message="welcome to home home";
        System.out.println(message.replace("home","java"));
        System.out.println(message.replaceAll("welcome to","i am at"));

        String s7="s.hasanfadavi6@gmail.com";
        System.out.println(s7.replaceAll("[^a-z 1-9]","x"));

        //ex
        String amount="$15,20,25";     //152025
        System.out.println(amount.replace("$","").replace(",",""));



        //split

        //example
        String s8="s.hasanfadavi@gmail.com";


        String[]messages=s8.split("@");
        System.out.println(messages[0]); //s.hasanfadavi
        System.out.println(messages[1]);  //gmail.com

        //example

        String txt="abc,123@xyz";    //abc   123   xyz

        String split[]=txt.split(",");    //abc    123@xyz
        System.out.println(split[0]);

        String split2[]=split[1].split("@");
        System.out.println(split2[0]);
        System.out.println(split2[1]);





//
//        //substring
//        String s6="welcome";
//        System.out.println(s6.substring(0,2));
//
//











    }
}
