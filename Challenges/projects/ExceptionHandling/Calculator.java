package projects.ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.print("Enter your first number :- ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter your Second number :- ");
        int num2 = input.nextInt();

        try {
            int result = num1 / num2;
            System.out.printf("Your result is :- %d", result);
        } catch (ArithmeticException exc) {
            if (exc.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero occured");
            } else {
                throw exc;
            }
        }
    }
}
