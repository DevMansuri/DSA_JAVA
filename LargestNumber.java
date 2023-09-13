import java.util.Scanner;

/**
 * Author : DevMansuri
 * Purpose : Take 2 numbers as input and print the largest number.
 */

public class LargestNumber {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter number
        System.out.print("Enter the First Number: ");
        double firstNumber = sc.nextDouble();

        // Prompt the user to enter number
        System.out.print("Enter Second Number: ");
        double secondNumber = sc.nextDouble();
        
        //For check largest number
        if (firstNumber > secondNumber) {
            System.out.println("Largest Number is: " + firstNumber);
        }
        else {
            System.out.println("Largest Number is: " + secondNumber);
        }
    }
}
