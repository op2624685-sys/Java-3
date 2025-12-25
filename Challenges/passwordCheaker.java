import java.util.Scanner;

public class passwordCheaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my Password checking program\n");
        
        String pass;
        do {
            System.out.print("Enter your password:- ");
            pass = input.next();
        } while (!isValidPassword(pass));
            System.out.print("Your pass was succesfully set");
    }
    public static boolean isValidPassword(String pass) {
        return pass.length() > 6;
    }
    
}
