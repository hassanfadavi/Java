package Activities.hassan.JAVA.Youtube.Day20_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static <set> void main(String[] args) {



//      HashSet mySet=new HashSet();

//        Set mySet=new HashSet();

        HashSet<Integer> mySet=new HashSet<Integer>();

        mySet.add(100);
        mySet.add(200);
        mySet.add(300);


//        mySet.remove(100);

        //conver

       ArrayList ar=new ArrayList(mySet);

       ar.get(0);
        System.out.println(ar);

        for(   var x:mySet   ){
            System.out.println(x);
        }








    }




}
