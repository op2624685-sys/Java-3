import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker\n");
        System.out.print("Enter your number:- ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrimeNumber(num) ? "prime" : "not prime"));
        

    }
    public static boolean isPrimeNumber(int num) {
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
