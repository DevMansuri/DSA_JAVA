import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Area of Isosceles Triangle.
 */
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the equal sides (a and b): ");
        double a = scanner.nextDouble();
        double b = a;

        // Since it's an isosceles triangle, both sides are equal.

        System.out.print("Enter the length of the base side (c): ");
        double c = scanner.nextDouble();

        double s = (a + b + c) /2;

        double area = Math.sqrt(s * (s-a) * (s -b) * (s - c));
        System.out.println("Area of Isosceles Triangle is : " + area);
        scanner.close();
    }
}
