package se.lexicon;

import java.util.ArrayList;
import java.util.List;


/**
 1. ArrayList can contain duplicate elements.
 2. ArrayList maintains insertion order.
 3. ArrayList in non synchronized.
 4. AArrayList allows random access because it works at the index base.
 */
public class ArrayListExample {

    public static void main(String[] args) {

        ex1();

    }


    private static void ex1(){

        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Group");
        strings.add("43");
        strings.add("!");
        strings.add(0,"Hello");


        System.out.println(strings);


    }
}
