package Activities.hassan.JAVA.ASSIGNMENT_JAVA.project;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class library {

    //Attributes
    private List<Book>listOfbooks;
    private List<Member>listOfMembers;
    private List<transaction>listOfTransaction;


    //constructor
    public library(){
        listOfbooks=new ArrayList<>();
        listOfMembers=new ArrayList<>();
    }





    //print
     public void printbooks(){
        for(int i=0;i<=listOfbooks.size()-1;i++){
            System.out.println(listOfbooks.get(i));
        }
     }





//        System.out.println("1. Add ISBN: ");

    }
