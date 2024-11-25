package Activities.hassan.JAVA.project.Library_Management_System.library_ms;

import java.util.*;

public class Library {

    // Attributes
    private final List<Book> booksList;
    private final List<Member> membersList;
    private final List<Transaction> transactionsList;
    private final Map<String, Book> bookMap;
    private final Map<String, Member> memberMap;

    // Constructor
    public Library() {
        booksList = new ArrayList<>();
        membersList = new ArrayList<>();
        transactionsList = new ArrayList<>();
        bookMap = new HashMap<>();
        memberMap = new HashMap<>();
    }

    // Book management
    public void addBook(Book book) {
        booksList.add(book);
        bookMap.put(book.getISBN(), book);
    }

    public void removeBook(String ISBN) {
        Book book = bookMap.get(ISBN);
        if (book != null) {
            booksList.remove(book);
            bookMap.remove(ISBN);
        }
    }

    public Book findBookByISBN(String ISBN) {
        return bookMap.get(ISBN);
    }

    public void printAllBooks() {
        for (Book book : booksList) {
            System.out.println(book);
        }
    }

    // Member management
    public void addMember(Member member) {
        membersList.add(member);
        memberMap.put(member.getMemberId(), member);
    }

    public void removeMember(String memberId) {
        Member member = memberMap.get(memberId);
        if (member != null) {
            membersList.remove(member);
            memberMap.remove(memberId);
        }
    }

    public Member findMemberById(String memberId) {
        return memberMap.get(memberId);
    }

    public void printAllMembers() {
        for (Member member : membersList) {
            System.out.println(member);
        }
    }

    // Borrowing and returning books

    public void issueBook(String memberId, String ISBN) {
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);
        if ( member != null && book != null && book.isAvailable() ) {
            book.setAvailability(false);
            member.borrowBook(book);
            String transactionId = "T" + (transactionsList.size() + 1);
            Transaction transaction = new Transaction(transactionId, ISBN, memberId);
            transactionsList.add(transaction);
            System.out.println("Book issued: " + transaction);
        } else {
            System.out.println("Cannot issue book. Either the book is unavailable or the member/book does not exist.");
        }
    }

    public void returnBook(String memberId, String ISBN) {
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);
        if (member != null && book != null && !book.isAvailable()) {
            book.setAvailability(true);
            member.returnBook(book);
            for (Transaction transaction : transactionsList) {
                if (transaction.getBookISBN().equals(ISBN) && transaction.getMemberId().equals(memberId) && transaction.getReturnDate() == null) {
                    transaction.setReturnDate(new Date());
                    System.out.println("Book returned: " + transaction);
                    break;
                }
            }
        } else {
            System.out.println("Cannot return book. Either the book is already available or the member/book does not exist.");
        }
    }

    // Print all transactions
    public void printAllTransactions() {
        for (Transaction transaction : transactionsList) {
            System.out.println(transaction);
        }
    }
}

