package se.lexicon;

public class Main {
    public static void main(String[] args) {

        Author tolkien = new Author();
        tolkien.setName("J. R. R. Tolkien");
        tolkien.setBirthYear(1892);


        Book lotr= new Book();
        lotr.setTitle("Lord Of the Rings");
        lotr.setIsbn("1293957100567");

        //Setting the Relationship, book has an Author.
        lotr.setAuthor(tolkien);

        //Setting the Relationship Author has Books.
        Book[] tolkiensBooks = new Book[1];
        tolkiensBooks[0] = lotr;
        tolkien.setBooks(tolkiensBooks);


        Author[] authorStorage = new Author[1];
        authorStorage[0]= tolkien;


    }
}