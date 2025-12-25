import java.util.Scanner;

public class OddEvenTernery {
    public static void main(String[] args) {
        System.out.println("Welcome to Odd & Even Cheacker\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = input.nextInt();
        String result = num %2 == 0 ? "Even": "Odd";
        System.out.println("Your number is: " + result);
    }
}
