package Activities.hassan.JAVA.ASSIGNMENT_JAVA.project;

import java.util.ArrayList;

public  class Member {

    //Attribute

    private final int memberId;
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<String> borrowedBooks;


    //constructor

    public Member(int memberId, String name, String email, String phoneNumber) {

        this.memberId = memberId;
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setBorrowedBooks(borrowedBooks);
    }

    //getter
    public int getMemberId() {
        return this.memberId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = this.phoneNumber;
    }

    private void setBorrowedBooks(ArrayList<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;

    }

    // Method To Display A list of Borrowed Books
    public void displayBorrowedBooks() {

    }

    ;

    //print
    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


}

