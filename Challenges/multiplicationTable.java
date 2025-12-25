import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Here you can create a multiplication table by giving number\n");
        System.out.print("Enter your number:- ");
        int num = input.nextInt();

        for (int i= 1 ; i <= 10 ; i++) {
            System.out.println(num + "x" + i + "=" + (i*num));
        }
    }
    
}
