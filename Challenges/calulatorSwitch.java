import java.util.Scanner;

public class calulatorSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to calulator by giving opration\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Now, enter your operation: ");
        String operation = input.next();

        int result = switch (operation) {
            case "+" -> (num1 + num2);
            case "-" -> (num1 - num2);
            case "*" -> (num1 * num2);
            case "/" -> (num1 / num2);
            default -> -1;
        };
        System.out.println("Your answer is:- " + result);
    }
}
