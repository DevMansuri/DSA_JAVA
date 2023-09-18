import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Perimeter of Circle .
 */
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = scanner.nextDouble();

        double perimeter = Math.PI * radius * 2;
        System.out.println("Perimeter of Circle is : " + perimeter);
        scanner.close();
    }
}
