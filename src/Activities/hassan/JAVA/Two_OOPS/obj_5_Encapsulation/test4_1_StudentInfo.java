package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation;

public class test4_1_StudentInfo {

       private int id;
       private String firstName ;
       private String lastName ;

       //constructor
        public test4_1_StudentInfo(int id, String firstName, String lastName){
            setId(id);      //or this.Id=Id;
            setFirstName(firstName);
            setLastName(lastName);
        }

        //Getters
        public int getId(){
            return this.id;
        }
         public String getFirstName(){
              return this.firstName;
        }
        public String getLastName(){
            return this.lastName;
        }

        //setters
    private void setId(int id){
            this.id=id;
    }
    private void setFirstName(String firstName){
            this.firstName=firstName;
    }
    private void setLastName(String lastName){
            this.lastName=lastName;
    }

//print
    public void printStudentInfo(){
        System.out.println("ID: "+getId());
        System.out.println("FirstName: "+getFirstName());
        System.out.println("last Name: "+getLastName());
    }



}









