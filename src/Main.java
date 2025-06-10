import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter student status");

        String studentStatus = scnr.nextLine();

        if (studentStatus.equals("UG")) {
            System.out.println("Undergrad");

        } else if (studentStatus.equals("G")) {
            System.out.println("grad");
        } else if (studentStatus.equals("DL")) {
            System.out.println("Distance Learning");
        } else {
            System.out.println("Error");
        }


        System.out.println("Enter homework points");
        Double homeworkPoints = scnr.nextDouble();

        System.out.println("Enter quiz points");
        Double quizPoints = scnr.nextDouble();

        System.out.println("Enter midterm points");
        Double midtermPoints = scnr.nextDouble();

        System.out.println("Enter final exam points");
        Double finalExam = scnr.nextDouble();

        convertPoints(homeworkPoints, quizPoints, midtermPoints, finalExam);
    }

    public static void convertPoints(Double homeworkPoints, Double quizPoints, Double midtermPoints, double finalExam) {

        Double convertHomework = (homeworkPoints / 800) * 100;
        Double convertQuiz = (quizPoints / 400) * 100;
        Double convertMidterm = (midtermPoints / 150) * 100;
        Double convertFinal = (finalExam / 200) * 100;


        System.out.println(convertHomework);
        System.out.println(convertQuiz);
        System.out.println(convertMidterm);
        System.out.println(convertFinal);

        if (convertHomework > 100) {
            convertHomework = 100.00;
        }
        if (convertQuiz > 100) {
            convertQuiz = 100.00;
        }
        if (convertMidterm > 100) {
            convertMidterm = 100.00;
        }
        if (convertFinal > 100) {
            convertFinal = 100.00;

            System.out.println("Homework %: " + convertHomework);
            System.out.println("Quiz %: " + convertQuiz);
            System.out.println("Midterm %: " + convertMidterm);
            System.out.println("Final %: " + convertFinal);
        }
    }
}
        //Step 2: Set any average to 100% if average is above 100%
    //Step 3: Calculate the course average based on student status
    //Step 4:

