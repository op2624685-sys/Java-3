import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Welcome to Day of the week detector\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Day in number: ");
        int day = input.nextInt();
        // oldSwitch(day);
        newSwitch(day);
    }

    // this is a new switch method
    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid";
        };
        System.out.println(dayStr);
    }

    // this is a old switch method
    public static void oldSwitch(int day) {

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Num");

        }
    }
}
