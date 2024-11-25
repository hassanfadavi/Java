package Activities.hassan.JAVA.Two_OOPS.obj_9_final;


public  class student extends person {


    //Attributes
    private  final int studentID;   //dont change in future

    //constructor
    public student(String fistName,String lastName,int age,int studentID){
      super(fistName,lastName,age);
//      setStudentID(studentID);
      this.studentID=studentID;    //
    }

     //getter
    public int getStudentID(){
        return this.studentID;
    }

   // setter
//    private void setStudentID(int studentID){
//        this.studentID=studentID;
//    }

    @Override
    public String toString() {
        return "student{" +"fistName='" + getFistName() + '\'' +
                ", lastName='" + getLastName()+ '\'' +
                ", age=" + getAge()+
                "studentID=" + getStudentID() +
                '}';
    }
}
