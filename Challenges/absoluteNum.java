import java.util.Scanner;

public class absoluteNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Absolute number converter\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute number is: " + result);
    }
}
