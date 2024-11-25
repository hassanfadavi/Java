package Activities.hassan.JAVA.ASSIGNMENT_JAVA.project;

public class book {

    //Attributes
    private final String ISBN;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private boolean isAvailable;

    //constructor
    public book(String ISBN, String title, String author, String publisher, int yearOfPublication, boolean isAvailable) {
        this.ISBN = ISBN;
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setYearOfPublication(yearOfPublication);
        this.isAvailable = true;
    }
    //getter
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
    private void makeAvailable(boolean available) {
        isAvailable = available;
    }


    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    //print
    public void printInfor(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("publisher: "+publisher);
        System.out.println("yearOfPublication: "+yearOfPublication);

    }






}
