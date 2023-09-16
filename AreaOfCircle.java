import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Area of Circle.
 */

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double radius = scanner.nextDouble();

        double area = Math.PI *(radius *radius);

        System.out.println("Area of Circle is : " + area);
    }
}
