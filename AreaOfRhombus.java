import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Area of Rhombus.
 */

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first diagonal: ");
        double diagonal1 = scanner.nextDouble();

        System.out.print("Enter the length of the second diagonal: ");
        double diagonal2 = scanner.nextDouble();

        // Calculate the area of the rhombus
        double area = (diagonal1 * diagonal2) / 2;

        System.out.println("The area of the rhombus with diagonals " + diagonal1 + " and " + diagonal2 + " is: " + area);

        scanner.close();
    }
}
