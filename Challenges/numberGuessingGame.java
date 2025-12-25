import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number guessing game\n");
        int inputNum;
        int guessingNum = 9;
        int isGuessingRight;
        do {
            System.out.print("Enter your number:- ");
            inputNum = input.nextInt();
        } while (inputNum != guessingNum);
        System.out.println("Your Guessing number is matched");
    }

}
