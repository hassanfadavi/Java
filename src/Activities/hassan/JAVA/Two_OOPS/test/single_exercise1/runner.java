package Activities.hassan.JAVA.Two_OOPS.test.single_exercise1;

public class runner {

    public static void main(String[] args) {

        var stu=new student(
                "hassan",
                "fadavi",
                "11/05/1989",
                "commander"
        );

        var emp=new Employee(
                "reihane",
                "moosavi",
                "06/14/2000",
                "company"


        );

        stu.printStu();
        System.out.println("***************************");
        emp.printEmployee();
//
    }

}
