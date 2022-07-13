package se.lexicon;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        arrays_vs_collection();
        traversing_an_collection();
    }

    public static void arrays_vs_collection(){

        //We as developers have ALL the control over the Array.
        //Fixed size
        String[] stringsArray = new String[5];

        //Access by id's
        stringsArray[0] = "Hello";
        stringsArray[1] = "Java";
        stringsArray[2] = "Group";
        stringsArray[3] = "43";
        stringsArray[4] = "!";

        System.out.println(stringsArray[0]);

        System.out.println(Arrays.toString(stringsArray));

        //--------------------------------------------------------

        // Functionality like adding, removing, finding etc..
        ArrayList<String> collectionOfStrings = new ArrayList<>();

        collectionOfStrings.add("Hello");
        collectionOfStrings.add("Java");
        collectionOfStrings.add("Group");
        collectionOfStrings.add("43");
        collectionOfStrings.add("!");


        System.out.println(collectionOfStrings);

        System.out.println("collectionOfStrings.size() = " + collectionOfStrings.size());

        System.out.println(collectionOfStrings.get(3)); // 43

        System.out.println("collectionOfStrings.contains(\"Java\") = " + collectionOfStrings.contains("Java"));

        String[] collectionToArray = collectionOfStrings.toArray(new String[0]);

    }

    public static void traversing_an_collection(){

        //Creating an arrayList of Doubles
        //Can't create collection of a primitive type.
        //Double is a wrapper of the primitive type of "double"
        Collection<Double> doubles = new ArrayList<>();
        doubles.add(20.6);
        doubles.add(Double.valueOf(59)); //Autoboxing - From primitive double value to Wrapper Class Double
        doubles.add(80d);

        System.out.println("--- For-Loop ---");

        for (Double d : doubles) {
            System.out.println(d.intValue()); // Unboxing - From Double class to primitive double


            // in for loop we are NOT allowed to remove elements in the collection. -> throws ConcurrentModificationException
//            if (d == 20.6){
//                doubles.remove(d);
//            }
        }

        System.out.println("--- Iterator ---");

        Iterator<Double> iterator = doubles.iterator();

            while (iterator.hasNext()){

                double numberToRemove = 20.6;

                Double d = iterator.next();

                //Better when removing.
                if (d.equals(numberToRemove)){
                    iterator.remove();
                    continue;
                }

                System.out.println(d);
            }

        System.out.println("--- Aggregated Operation ---");

            doubles.forEach((d) -> System.out.println(d));

    }

    private static void wrappers_of_Primitives() {
        //Wrappers of primitives
        Double d = 1230.023;
        Integer i = 123;
        Byte b = 41;
        Float f = 123.62F;
        Short s = 123;
        Long l = 9182393L;
        Character c = 's';
        Boolean bool = true;
    }



}