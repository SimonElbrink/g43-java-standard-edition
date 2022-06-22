package se.lexicon;

public class Main {
    public static void main(String[] args) {
        //Instantiating a book.
        Book ocaBook = new Book();

        //Assign Value.
        ocaBook.setTitle("OCA Study Guide");
        ocaBook.setAuthor("Jeanne & Scott");
        ocaBook.setPrice(250);

        //Calling the method in book class.

        System.out.println(ocaBook.getTitle());
//        System.out.println(ocaBook.getInformation());

        Book javaCore = new Book();
        javaCore.setTitle("Java Core vol:1 12th");
        javaCore.setAuthor("Cay S. Horstmann");
        javaCore.setPrice(407);

        System.out.println(javaCore.getInformation());



//        Person simon = new Person();
//        simon.name = "Simon Elbrink";
//        simon.gender = "MALE";
//        simon.age = 25;

        Person simon = new Person("Simon Elbrink", 25, "MALE", true);

//        new Person(); // We don't have a default constructor anymore


        Person kent = new Person("Kent Gudmundsen", 15 );

        System.out.println(kent.getInformation());
        System.out.println(simon.getInformation());

        Person person1 = new Person();
        System.out.println(person1.getInformation());


        Address hjalmarPetrisVäg52 =
                new Address("Hjalmarpetrisväg 52", "12345", "Växjö","Sweden");


        kent.setAddress(hjalmarPetrisVäg52);
        simon.setAddress(hjalmarPetrisVäg52);


        simon.setGender(null);



    }
}