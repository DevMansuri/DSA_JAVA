import java.util.Scanner;

/**
 * Author : DevMansuri
 * Purpose : To calculate Fibonacci Series up to n numbers.
 */

public class CalculateFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter number
        System.out.print("Enter the number in rupees: ");
        
        int n = sc.nextInt();

        int firstNumber = 0;
        int secondNumber =1;

        for(int i = 1; i < n; i++ ) {
            int temp = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = temp;

            System.out.println(temp);
        }
    }
}
