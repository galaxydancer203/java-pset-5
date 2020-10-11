import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String grade = input.nextLine();
        input.close();
        double gpa = 0;
        double signDetect = 0;
        if (grade.length() == 1 || grade.length() == 2) {
            switch (grade.substring(grade.length() - 1)) {
                case "+":
                    signDetect += 0.33;
                    break;
                case "-":
                    signDetect -= 0.33;
                    break;
                default:
                    break;
            }
            switch (grade.substring(0, 1)) {
                case "A":
                    gpa += 4;
                    if (grade.substring(grade.length() - 1).equals("-")) {
                        gpa += signDetect;
                    }
                    System.out.printf("%nYour GPA is %.2f.", gpa);
                    break;
                case "B":
                    gpa += 3 + signDetect;
                    System.out.printf("%nYour GPA is %.2f.", gpa);
                    break;
                case "C":
                    gpa += 2 + signDetect;
                    System.out.printf("%nYour GPA is %.2f.", gpa);
                    break;
                case "D":
                    gpa += 1 + signDetect;
                    System.out.printf("%nYour GPA is %.2f.", gpa);
                    break;
                case "F":
                    System.out.printf("%nYour GPA is %.2f.", gpa);
                    break;
                default:
                    System.out.printf("%nThat's not a valid letter grade.");
            }
        } else {
            System.out.printf("%nThat's not a valid letter grade.");
        }
    }
}
