import java.util.Scanner;

public class postiveNegative {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // reading a number from the user
        num = sc.nextInt();
        // checks the number is greater than 0 or not
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        // checks the number is less than 0 or not
        else if (num < 0) {
            System.out.println("The number is negative.");
        }

        else {
            System.out.println("The number is zero.");
        }
    }
}