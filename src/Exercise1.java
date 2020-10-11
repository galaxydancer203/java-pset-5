import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = input.nextInt();
        input.close();
        if (inputInt > 0) {
            System.out.printf("%nPositive.");
        } else if (inputInt < 0) {
            System.out.printf("%nNegative.");
        } else {
            System.out.printf("%nZero.");
        }
    }
}