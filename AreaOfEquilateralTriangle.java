import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Area of Equilateral Triangle.
 */
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the side : ");
        double sideLength = scanner.nextDouble();

        double area = (((Math.sqrt(3)) / 4) * sideLength * sideLength);
        System.out.println("Area of Equilateral Triangle is : " + area);
        scanner.close();
    }
}
