import java.util.Scanner;

public class monthByNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Month chacker by it's number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your month number: ");
        int month = input.nextInt();
        String monthName = getMonthName(month);
        System.out.println("Your month name is: " + monthName);
    }

    // Here we use switch 
    public static String getMonthName(int month) {
        String monthName = switch (month) {
            case 1 -> "Janbary";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "Septumber";
            case 10 -> "Octuber";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        return monthName;
    }
}
