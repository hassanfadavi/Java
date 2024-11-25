package Activities.hassan.JAVA.ASSIGNMENT_JAVA.F_ClassesObjects;

public class F_3_2_LibraryBook {
    public static void main(String[] args) {
        var objBook1=new F_3_1_LibraryBook();

        objBook1.title="Journey to the Center of the Earth";
        objBook1.author="Jules Verne";
        objBook1.ISBN=1234567890;


        var objBook2=new F_3_1_LibraryBook();

        objBook2.title="The Great Gatsby";
        objBook2.author="F. Scott Fitzgerald";
        objBook2.ISBN=978-0743273565;


        var objLibrarian=new F_3_3_Librarian();
       objLibrarian.librarianName="hassan";
       objLibrarian.employedAt="depart";
       objLibrarian.currentlyReading= objBook1.title;




        //modify
        objBook1.author="Mark Twain";

        //PRINT
        objBook1.displayBookInfo();
        objBook2.displayBookInfo();
        objLibrarian.displayLibrarian();









    }
}
