package se.lexicon;

public class SelectionExamples {

    public static void main(String[] args) {

/*
        int grade = 54;

        if(grade >= 65){
            System.out.println("You have passed The Test");
        }else if (grade >= 55){
            System.out.println("You Almost Passed the Test!");
        }
        else{
            System.out.println("You have not Passed the Test! :(");
        }
*/



        //Employees Role

        //CEO, MANGER, SUPPORT, TEACHER
        String employee = "CEO";

        switch (employee){
            case "CEO":
                System.out.println("Hello, here is the report about the company's Health");
                break;

            case "MANAGER":
                System.out.println("Hello and Welcome back, here is the Report you asked about Yesterday!");
                break;

            default:
                System.out.println("Hm.. Not Sure who you are but i guess.. Welcome?");
        }















    }
}
