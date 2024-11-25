package Activities.hassan.JAVA.Two_OOPS.obj_7_Polymorphism_Overloading;

public class obj_7_Polymorphism {
    public static void main(String[] args) {

      add(10,20);
      add(50,100);
      add(30,30);

      var obj=new obj_7_Polymorphism();
      obj.add(15,20);
    }



    public int add(byte a,int b){
        return a+b;
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }

    public static void add(int a,byte b){
        System.out.println(a+b);
    }

    public static void add(int a,int b){
        System.out.println(a+b);
    }



}
