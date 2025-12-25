import java.util.Scanner;

public class findSmallNum {
    public static void main(String[] args) {
        System.out.println("Welcome to my smallest digit checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number:- ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second Number:- ");
        int num2 = input.nextInt();
        // Here we use ternary oprator.
        int smallestNumber = num1 < num2 ? num1 : num2;
        System.out.println(smallestNumber + " is the smallest number");
    }
}