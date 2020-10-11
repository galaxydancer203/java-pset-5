import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String temp = input.nextLine();
input.close();
        double temperature = Double.parseDouble(temp.substring(0,(temp.length()-2)));
        String measure = (temp.substring(temp.length()-1,temp.length())).toLowerCase();
        System.out.print("\n");
        if(measure.equals("f")){
            if(temperature >= 212){
                System.out.print("Gas.");
            }else if(temperature >= 32){
                System.out.print("Liquid.");
            }else{
                System.out.print("Solid.");
            }
        }else if(measure.equals("c")){
            if(temperature >= 100){
                System.out.print("Gas.");
            }else if(temperature >= 0){
                System.out.print("Liquid.");
            }else{
                System.out.print("Solid.");
            }
        }else{
            System.out.print("That's not a valid scale.");
        }
    }
}