import java.util.Scanner;

/**
 * Author : DevMansuri
 * Purpose : To find Armstrong Number between two given number.
 */

public class ArmstrongNumber {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter number

        System.out.print("Enter the Number: ");
        int a = sc.nextInt();

        // Prompt the user to enter number
        System.out.print("Enter the Number: ");
        int b = sc.nextInt();
        
        for(int i = a; i < b; i++ ) {
            int num = i;
            int sum = 0;

            while(num > 0) {
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if(sum == i) {
                System.out.println(sum);
            }
        }
    }
}
