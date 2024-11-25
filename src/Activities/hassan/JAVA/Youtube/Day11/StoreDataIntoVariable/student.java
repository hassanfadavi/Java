package Activities.hassan.JAVA.Youtube.Day11.StoreDataIntoVariable;

public class student {

    //variable
    int id;
    String name;
    char grade;

    //1 approach  method

    void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(grade);
    }


    //2 approach-method
    void stdata(int sid,String sname,char grade){
        id=sid;
        name=sname;

    }







    //3 approach-constructor

      student(int sid,String sname,char grade){

          id=sid;
          name=sname;

          }

      }


