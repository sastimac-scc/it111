import java.util.Scanner;

public class GradeAveraging {

    public static void main(String[] args) {

        // ask the end user tyo input their numerical grades
        int counter = 1;
        int grade =0;
        double total = 0.0;
        double average = 0.0;

        Scanner input = new Scanner(System.in);

        // our while loop will count how many times we are asking the end user to input a grade

        while(counter <= 5) {
            System.out.println("Please enter your " + counter + " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } // end while when counter reaches 6

        String message;
        char letterGrade;

        // decrement counter to correct number of inputs
        counter -= 1;
        average = total/counter;

        System.out.println(average);

        System.out.println("You have earned an average grade of " + average);
        System.out.println("_______________________________");

        if(average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";

        } else if (average >= 80 && average <= 90) {
            letterGrade = 'B';
            message = "Solid work!";

        } else if (average >= 70 && average <= 80) {
            letterGrade = 'C';
            message = "More studying necessary";
        } else if (average >= 60 && average <= 70) {
            letterGrade = 'D';
            message = "Sqeaking by!";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade";
        }

        System.out.println("You have earned the following letter grade " + letterGrade + " and here is the message ==> " + message);
    }
}