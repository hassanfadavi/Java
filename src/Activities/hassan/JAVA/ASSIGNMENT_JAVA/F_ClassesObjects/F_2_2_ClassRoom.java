package Activities.hassan.JAVA.ASSIGNMENT_JAVA.F_ClassesObjects;

public class F_2_2_ClassRoom {
    public static void main(String[] args) {

        var objClass1=new F_2_1_ClassRoom();
        objClass1.roomNumber=101;
        objClass1.capacity=30;
        objClass1.subject="Mathematics";


        var objClass2=new F_2_1_ClassRoom();
        objClass2.roomNumber=102;
        objClass2.capacity=25;
        objClass2.subject="literature";

        var objTeacher=new F_2_3_teacher();
        objTeacher.teacherName="techer1";
        objTeacher.subjectSpecialization="math";
        objTeacher.assignedClassroom=objClass1.roomNumber;





//        objClass1.subject="Physics";
        //print
        objClass1.displayClassInfo();
        objClass2.displayClassInfo();
        objTeacher.printTeacher();



    }
}
