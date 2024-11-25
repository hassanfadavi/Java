package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation;

public class test4_2_Main {
    public static void main(String[] args) {

      var firstStudent=new test4_1_StudentInfo(
              1,
              "hassan",
              "fadavi"
      );
        var secondStudent=new test4_1_StudentInfo(
                2,
                "reihane",
                "Moosavi"
        );

        firstStudent.printStudentInfo();
        secondStudent.printStudentInfo();

        System.out.println(firstStudent.getFirstName());




    }
}







