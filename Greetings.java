import java.util.Scanner;

/**
 * Author : DevMansuri
 * Purpose : create a porgram to Take name as input and print a greeting message for that particular name.
 */
public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
       
        System.out.println("Hello " + name);
    }   
    
}
