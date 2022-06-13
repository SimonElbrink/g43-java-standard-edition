package se.lexicon.fundamentals.array;

import java.util.Arrays;

public class ArrayUtilExamples {

    public static void main(String[] args) {

//        ex1();

        combineArrays();
    }

    private static void ex1() {
        String[] names = {
                "Christopher Ojaide",
                "Husayn Ganiev",
                "Jonas Eira",
                "Julia Lindman",
                "Julius Büchner",
                "Nader Alhamwi",
                "Patrik Axelsson",
                "Roudabeh Adnani",
                "Mohsen Forouzmand",
                "Ta Thi Ly",
                "Anusha Yenugu",
                "Roberto Camacho Hakkarainen",
                "Thanapat Sombatkamrai",
                "Zeq Alidemaj",
                "Joe Yaghiv",
                "Jack Ninway",
                "Jennie Henriksson Smith",
                "Rosita Axelsson",
                "Nazifa Husseini"
        };

        //Sort
        Arrays.sort(names);

        //BinarySearch
        int index = Arrays.binarySearch(names, "Jack NinwayYYYYY");
        System.out.println("At Index: " + index);


        //Expanding the array by ONE
        names = Arrays.copyOf(names, names.length + 1);

        //Adding Simon at last index
        names[names.length - 1] = "Simon Elbrink";


        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }


    public static void combineArrays(){
        String[] group43students = {
                "Christopher Ojaide",
                "Husayn Ganiev",
                "Jonas Eira",
                "Julia Lindman",
                "Julius Büchner",
                "Nader Alhamwi",
                "Patrik Axelsson",
                "Roudabeh Adnani",
                "Mohsen Forouzmand",
                "Ta Thi Ly",
                "Anusha Yenugu",
                "Roberto Camacho Hakkarainen",
                "Thanapat Sombatkamrai",
                "Zeq Alidemaj",
                "Joe Yaghiv",
                "Jack Ninway",
                "Jennie Henriksson Smith",
                "Rosita Axelsson",
                "Nazifa Husseini"
        };

        String[] staffAtLexicon= {
                "Simon Elbrink",
                "Mehrdad Javan",
                "Åsa Jonsson",
                "Marcus Gudmundsen",
                "Kent Gudmundsen",
        };

//        group43students[group43students.length] = staffAtLexicon[0];

        String[] lexiconSociety = Arrays.copyOf(
                group43students,
                group43students.length + staffAtLexicon.length); //19 + 5 new length


        System.out.println(Arrays.toString(lexiconSociety));

        //Where to start adding form
        int index = group43students.length;

        //Add staff to society
        for (int i = 0; i < staffAtLexicon.length;i++){
            lexiconSociety[index] = staffAtLexicon[i];
            index++;
            System.out.println(Arrays.toString(lexiconSociety));
        }

    }


}
