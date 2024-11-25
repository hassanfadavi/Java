package Activities.hassan.JAVA.Youtube.Day20_ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {



//         HashMap  myHash=new HashMap();
//         Map myash=new HashMap();



        HashMap<Integer,String>  myHash=new HashMap<Integer,String>();

        myHash.put(101,"John");
        myHash.put(102,"MM");
        myHash.put(103,"HASAN");
        myHash.put(104,"John");

        System.out.println(myHash);

        System.out.println(myHash.size());

        myHash.remove(102);
        System.out.println(myHash);


        System.out.println(myHash.get(103));

        System.out.println(myHash.keySet());
        System.out.println(myHash.values());
        System.out.println(myHash.entrySet());

        System.out.println("*************************");

        for( int  k:myHash.keySet() ){

            System.out.println(k+","+myHash.get(k));

        }








    }
}
