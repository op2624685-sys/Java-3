import java.util.Scanner;

public class studentScore {
    public static void main(String[] args) {
        System.out.println("Welcome to student score checker\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Score: ");
        int score = input.nextInt();
        String result = score >= 80 ? "High" : (score >= 50 ? "Moderate" : "low");
        System.out.println("Your Score is: " + result);
    }
}
