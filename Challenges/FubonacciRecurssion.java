import java.util.Scanner;

public class FubonacciRecurssion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing Fubonacci Series");
        System.out.print("Enter the number of elements to be printed: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(fubonacci(i) + "  ");
        }
    }

    public static int fubonacci(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fubonacci(position - 1)
                + fubonacci(position - 2);
    }
}
