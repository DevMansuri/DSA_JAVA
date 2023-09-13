import java.util.Scanner;

/**
 * Author : DevMansuri
 * Purpose : Input currency in rupees and output in USD.
 */

public class USD {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter number
        System.out.print("Enter the number in rupees: ");
        double rupees = sc.nextDouble();

        double exchangeRate = 0.012;

        double usd = rupees * exchangeRate;
        System.out.print("USD : " + usd);
    }
}
