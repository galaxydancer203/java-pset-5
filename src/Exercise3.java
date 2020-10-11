import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter three integers.%n%n");
        System.out.print("Enter integer: ");
        int intOne = input.nextInt();
        System.out.print("Enter integer: ");
        int intTwo = input.nextInt();
        System.out.print("Enter integer: ");
        int intThree = input.nextInt();
        if (intOne == intTwo && intTwo == intThree) {
            System.out.printf("%nSame.");
        } else if (intOne < intTwo && intTwo < intThree) {
            System.out.printf("%nStrictly increasing.");
        } else if (intOne <= intTwo && intTwo <= intThree) {
            System.out.printf("%nIncreasing.");
        } else if (intOne > intTwo && intTwo > intThree) {
            System.out.printf("%nStrictly decreasing.");
        } else if (intOne >= intTwo && intTwo >= intThree) {
            System.out.printf("%nDecreasing.");
        } else {
            System.out.printf("%nUnordered");
        }
    }
}