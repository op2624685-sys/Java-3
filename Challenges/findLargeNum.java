import java.util.Scanner;

public class findLargeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my largest number checker\n");
        System.out.print("Enter Your First Number:- ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = input.nextInt();
        // Here we use ternary oprator.
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest number");
    }
}
