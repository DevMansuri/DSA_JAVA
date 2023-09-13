import java.util.Scanner;

/**
 * Author : DevMansuri
 * Purpose : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest. 
 */

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter principal amount (P)
        System.out.print("Enter the principal amount (P): ");
        double principal = sc.nextDouble();

        // Prompt the user to enter time in years (T)
        System.out.print("Enter the time in years (T): ");
        double time = sc.nextDouble();

        // Prompt the user to enter the rate of interest (R)
        System.out.print("Enter the rate of interest (R): ");
        double rate = sc.nextDouble();

        // Calculate the simple interest using the formula: SI = (P * T * R) / 100
        double simpleInterest = (principal * time * rate) / 100;

        // Display the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        // Close the Scanner object
        sc.close();
    }
}