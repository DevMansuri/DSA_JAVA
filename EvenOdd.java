import java.util.Scanner;


/**
 * Author : DevMansuri
 * Purpose : Create a progran to check number is even or odd. 
 */

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
} 