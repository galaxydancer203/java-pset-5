import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        double grade = input.nextDouble();
        input.close();
        grade = Math.round(grade);
        if (grade < 0) {
            System.out.printf("%nGrades below 0 are invalid.");
        } else if (grade > 100) {
            System.out.printf("%nGrades above 100 are invalid.");
        } else {
            if (grade >= 90) {
                System.out.printf("%nYou received an A.");
            } else if (grade >= 80) {
                System.out.printf("%nYou received a B.");
            } else if (grade >= 70) {
                System.out.printf("%nYou received a C.");
            } else if (grade >= 60) {
                System.out.printf("%nYou received a D.");
            } else {
                System.out.printf("%nYou received an F.");
            }
        }
    }
}