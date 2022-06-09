package se.lexicon.array;

import java.util.Arrays;

public class ArrayUtilExamples {

    public static void main(String[] args) {

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


}
