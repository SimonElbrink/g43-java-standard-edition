package se.lexicon;
//Created a Class = new Type of Object = Blueprint
public class Book {

    //Fields , Members, State  = Attributes for a book.
    private String title;
    private double price;
    private String author;
//    String description;
//    String ISBN;
//    int pages;
//    String category;


    //Behavior, Method, Getters and Setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInformation(){
        return "Book Title: " + title + " author: " + author + " price for the book: " + price;
    }







}
