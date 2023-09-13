import java.util.Scanner;

/**
 * Author : DevMansuri
 * Purpose : To find out whether the given String is Palindrome or not.
 */

public class PalindromString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter number
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String reverString = "";

        int strLength = str.length();
        for(int i = (strLength - 1); i >= 0 ; i--) {
            reverString = reverString + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverString.toLowerCase())) {
            System.out.print("true");

        }
        else {
            System.out.print("false");

        }

    }

}
