import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = input.nextInt();
        String monthName;

        switch (days) {
            case 28:
                monthName = "February";
                break;
            case 30:
                monthName = "September April June November";
                break;
            case 31:
                monthName = "January March May July August October December";
                break;
            default:
                monthName = "There are no months with exactly " + days + " days.";
                break;
        }

        System.out.println(monthName);
    }
}
