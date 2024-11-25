package Activities.hassan.JAVA.Youtube.Day13_Static.ClassVariable;

public class test1 {


    //class variable
   public static int x;


    void setDat(int a  ){   //local variable
        x=a;

    }

    void print(){
        System.out.println(x);
    }


    public static void main(String[] args) {

        test1  obj=new test1 ();

        obj.setDat(30);

        int p=obj.x=20;
        System.out.println(p);




    }







}
