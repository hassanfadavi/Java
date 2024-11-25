package Activities.hassan.JAVA.Youtube.Day13_Static.Static;

public class Student {


  //static variable
  static  int a=10;

  //non-static variable
  int b=20;



  //static method
    static void m1(){   //static method
      System.out.println(a+": Static");


  }


  //non-static method
  void m2(){   //non_static
      System.out.println(b+": non-static");
    System.out.println(a);
  }

  //non-static method
  void m3(){
    System.out.println(a);
    System.out.println(b);
    m2();
    m1();
  }


  static String s="welcome";


}
