import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = input.nextLine().toLowerCase();

        String str;
        switch(month) {
            case "january": case "march": case "may": case "july":
            case "august": case "october": case "december":
                str = "31 days.";
                break;
            case "april": case "june": case "september": case "november":
                str = "30 days.";
                break;
            case "february":
                str = "28 or 29 days.";
                break;
            default:
                str = "That's not a valid month.";
                break;
        }
        System.out.printf("%n%s%n", str);
        input.close();
    }
}