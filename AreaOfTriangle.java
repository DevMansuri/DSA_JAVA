import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Area of Triangle.
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of Triangle :");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of Triangle :");
        double height = scanner.nextDouble();

        double area = (base * height)/2;
        System.out.println("Area of Triangle is : " + area);

    }
}
