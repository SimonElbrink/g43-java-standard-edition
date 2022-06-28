package se.lexicon;

public class Book {
    // Title, Author, ISBN

    //Private is a part of making the class have encapsulation.
    private String title;
    private String isbn;
    private Author author; // Relationship




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
