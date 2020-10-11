import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = input.nextInt();
        input.close();
        if (inputInt % 2 != 0) {
            System.out.printf("%nOdd.");
        } else {
            System.out.printf("%nEven.");
        }
    }
}