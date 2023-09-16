import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Area of Rectangle.
 */
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Width :");
        double width = scanner.nextDouble();

        System.out.print("Enter the length :");
        double length = scanner.nextDouble();

        double area = length * width ;
        System.out.println("Area of Rectangle is : " + area);

    }
}
