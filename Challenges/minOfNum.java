import java.util.Scanner;

public class minOfNum {
    public static void main(String[] args) {
        System.out.println("welcome to find minimum of number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number:- ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number:- ");
        int num2 = input.nextInt();
        int result = num1 > num2 ? num1 : num2;
        System.out.println(result + " is the smallest number");
    }
}
